package com.anyaudit.service;


import com.anyaudit.models.StandardizedReports;
import com.anyaudit.repository.StandardizedReportsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StandardizedReportsManager {
    @Autowired
    private StandardizedReportsRepository standardizedReportsRepository;

    public List<StandardizedReports> getAll() {
        return standardizedReportsRepository.findAll();
    }
    public String findNameById(Long id) {
        Optional<StandardizedReports> form = standardizedReportsRepository.findById(id);
        return form.map(StandardizedReports::getName).orElse(null);
    }
}
