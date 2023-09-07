package com.anyaudit.util.azure.service;
import com.anyaudit.util.SystemProperties;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Objects;


@Service
@Slf4j
public class AzureServiceImpl implements AzureService{

    @Autowired(required = false)
    private BlobServiceClient blobServiceClient;

    @Autowired
    private SystemProperties properties;

    @Override
    public String uploadFile(String containerName, MultipartFile file) {
        if(Objects.isNull(blobServiceClient)){
            log.error("BlobServiceClient not configured to upload file");
            throw new RuntimeException("service not found to upload file");
        }
        else {
            BlobContainerClient containerClient = blobServiceClient.getBlobContainerClient(containerName);
            try {
                containerClient.getBlobClient(file.getOriginalFilename()).upload(file.getInputStream(), file.getSize(),false);
                // Construct and return the URL
                String blobUrl = String.format("https://%s.blob.core.windows.net/%s/%s",
                        properties.getProperty(SystemProperties.SysProps.AZURE_STORAGE_ACCOUNT_NAME), containerName, file.getOriginalFilename());
                return blobUrl;
            }
            catch (Exception e){
                log.error(e.getMessage());
                throw new RuntimeException(" upload  file failed , Internal server error");
            }
        }
    }
}
