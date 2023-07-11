package com.anyaudit.service;

import com.anyaudit.models.Annexures;
import com.anyaudit.models.CustomizedReports;

import com.anyaudit.repository.CustomizedReportsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomizedReportsManager {
    @Autowired
    private CustomizedReportsRepository customizedReportsRepository;


    public List<CustomizedReports> getAll() {
        return customizedReportsRepository.findAll();
    }

    public String findNameById(Long id) {
        Optional<CustomizedReports> form = customizedReportsRepository.findById(id);
        return form.map(CustomizedReports::getDraft).orElse(null);
    }
}
