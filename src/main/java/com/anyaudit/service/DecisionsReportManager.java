package com.anyaudit.service;

import com.anyaudit.models.ClassifiersGroup;
import com.anyaudit.models.DecisionsReport;
import com.anyaudit.repository.DecisionsReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DecisionsReportManager {
    @Autowired
    private DecisionsReportRepository decisionsReportRepository;

    public List<DecisionsReport> getAll() {
        return decisionsReportRepository.findAll();
    }

    public Optional<DecisionsReport> getbyID(Long id) {
        return decisionsReportRepository.findById(id);
    }
}
