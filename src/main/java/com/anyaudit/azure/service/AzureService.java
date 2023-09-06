package com.anyaudit.azure.service;

import com.azure.storage.blob.BlobServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

public interface AzureService {
    String uploadFile(String containerName, MultipartFile multipartFile);
}
