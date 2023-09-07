package com.anyaudit.util.azure;

import com.anyaudit.util.SystemProperties;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class AzureBlobServiceClientConfig {

    @Autowired
    private SystemProperties properties;

    @Bean
    public BlobServiceClient configureBlobServiceClient(){
        BlobServiceClient blobServiceClient = null;
        if(StringUtils.isEmpty(properties.getProperty(SystemProperties.SysProps.AZURE_STORAGE_ACCOUNT_KEY))){
           log.warn("Azure storage account key required to configure azureBlobServiceClient");
        }
        else if(StringUtils.isEmpty(properties.getProperty(SystemProperties.SysProps.AZURE_STORAGE_ACCOUNT_NAME))){
            log.warn("Azure storage account name required to configure azureBlobServiceClient");
        }
        else {
            String connectionString = String.format("DefaultEndpointsProtocol=https;AccountName=%s;AccountKey=%s;EndpointSuffix=core.windows.net",
                    properties.getProperty(SystemProperties.SysProps.AZURE_STORAGE_ACCOUNT_NAME),
                    properties.getProperty(SystemProperties.SysProps.AZURE_STORAGE_ACCOUNT_KEY));
            blobServiceClient =new BlobServiceClientBuilder().
                    connectionString(connectionString).buildClient();
        }
        return blobServiceClient;
    }

}
