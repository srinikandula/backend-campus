package com.anyaudit.service;

import com.anyaudit.models.CustomizedReports;

import com.anyaudit.repository.CustomizedReportsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomizedReportsManager {
    @Autowired
    private CustomizedReportsRepository customizedReportsRepository;


    public List<CustomizedReports> getAll() {
        return customizedReportsRepository.findAll();
    }
}
