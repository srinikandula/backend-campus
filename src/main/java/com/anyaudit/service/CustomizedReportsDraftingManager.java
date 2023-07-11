package com.anyaudit.service;

import com.anyaudit.models.CustomizedReportsDrafting;
import com.anyaudit.models.StandardizedReportsQuestion;
import com.anyaudit.repository.CustomizedReportsDraftingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomizedReportsDraftingManager {
    @Autowired
    private CustomizedReportsDraftingRepository customizedReportsDraftingRepository;

    public List<CustomizedReportsDrafting> getAll() {
        return customizedReportsDraftingRepository.findAll();
    }

}
