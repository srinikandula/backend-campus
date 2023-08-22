package com.anyaudit.util;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.*;
import com.amazonaws.util.IOUtils;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.PostConstruct;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

@Component
public class AmazonClient {
    private static final Logger logger = LoggerFactory.getLogger(AmazonClient.class);

    final static String S3_BUCKET_NAME = ""; // Has to get this value from system properties file later

    @Autowired
    private SystemProperties systemProperties;
    @Setter
    private AmazonS3 s3Client;


    @PostConstruct
    private void initializeAmazon() {
        String awsAccessKey = systemProperties.getProperty("aws.accesskey");
        String awsSecretKey = systemProperties.getProperty("aws.secretkey");
        if(StringUtils.isEmpty(awsAccessKey)|| StringUtils.isEmpty(awsSecretKey)){
            throw new IllegalStateException("Please check config for aws crendentials");
        }
        AWSCredentials credentials = new BasicAWSCredentials(awsAccessKey, awsSecretKey);
        s3Client = AmazonS3ClientBuilder.standard()
                .withRegion("us-east-1")
                .withCredentials(new AWSStaticCredentialsProvider(credentials)).build();
    }
    public JSONObject uploadFile(String fileName, MultipartFile mFile) throws IOException {
        InputStream stream = null;
        try {
            stream = new ByteArrayInputStream(IOUtils.toByteArray(mFile.getInputStream()));
            ObjectMetadata meta = new ObjectMetadata();
            meta.setContentLength(stream.available());
            meta.setContentType(mFile.getContentType());
            PutObjectResult result = s3Client.putObject(new PutObjectRequest(S3_BUCKET_NAME, fileName, stream, meta));
        }finally {
            if(stream != null){
                stream.close();
            }
        }
        return new JSONObject();
    }
    @Async
    public JSONObject uploadFileAsync(String fileName, MultipartFile mFile) throws IOException {
        return uploadFile(fileName, mFile);
    }
    public JSONObject uploadFile(String fileName, byte[] contents, String contentType) throws IOException {
        InputStream stream = null;
        try {
            stream = new ByteArrayInputStream(contents);
            ObjectMetadata meta = new ObjectMetadata();
            meta.setContentLength(contents.length);
            meta.setContentType(contentType);
            PutObjectResult result = s3Client.putObject(
                    new PutObjectRequest(S3_BUCKET_NAME, fileName, stream, meta));
        }finally {
            if(stream != null){
                stream.close();
            }
        }
        return new JSONObject();
    }
    public JSONObject uploadFile(String fileName, ByteArrayOutputStream os, String contentType) throws IOException {
        InputStream stream = null;
        try {
            stream = new ByteArrayInputStream(os.toByteArray());
            ObjectMetadata meta = new ObjectMetadata();
            meta.setContentLength(stream.available());
            meta.setContentType(contentType);
            PutObjectResult result = s3Client.putObject(new PutObjectRequest(S3_BUCKET_NAME, fileName, stream, meta));
            stream.close();
            os.close();
        }finally {
            if(stream != null){
                stream.close();
            }
        }
        return new JSONObject();
    }

    public String getSignedURL(String bucketName, String filePath){
        GeneratePresignedUrlRequest req = new GeneratePresignedUrlRequest(bucketName, filePath);
        ResponseHeaderOverrides overrides = new ResponseHeaderOverrides();
        overrides.setContentDisposition("attachment; filename="+filePath);
        req.setResponseHeaders(overrides);
        URL url = s3Client.generatePresignedUrl(req);
        return url.toString();
    }
    public String getSignedURL(String filePath){
        return getSignedURL(S3_BUCKET_NAME, filePath);
    }


    public InputStream downloadFile( String key) throws IOException {
        S3Object result = s3Client.getObject(S3_BUCKET_NAME,key);
        S3ObjectInputStream data = result.getObjectContent();
        InputStream stream = new ByteArrayInputStream(IOUtils.toByteArray(data));
        return stream;
    }

    public InputStream downloadFile(String bucketName, String filePath) throws IOException {
        S3Object result = s3Client.getObject(bucketName,filePath);
        S3ObjectInputStream data = result.getObjectContent();
        InputStream stream = new ByteArrayInputStream(IOUtils.toByteArray(data));
        return stream;
    }

    public void deleteFile(String key){
        s3Client.deleteObject(S3_BUCKET_NAME,key);
    }

    public void uploadBase64Image(String fileName, InputStream fis,byte[] bI) {
        ObjectMetadata metadata = new ObjectMetadata();
        metadata.setContentLength(bI.length);
        metadata.setContentType("image/png");
        metadata.setCacheControl("public, max-age=31536000");

        s3Client.putObject(new PutObjectRequest(S3_BUCKET_NAME, fileName, fis, metadata));
    }
}

