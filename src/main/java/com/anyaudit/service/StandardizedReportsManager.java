package com.anyaudit.service;


import com.anyaudit.models.StandardizedReports;
import com.anyaudit.repository.StandardizedReportsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StandardizedReportsManager {
    @Autowired
    private StandardizedReportsRepository standardizedReportsRepository;

    public List<StandardizedReports> getAll() {
        return standardizedReportsRepository.findAll();
    }

}
