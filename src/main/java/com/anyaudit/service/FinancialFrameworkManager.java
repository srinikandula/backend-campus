package com.anyaudit.service;

import com.anyaudit.models.CustomizedReports;
import com.anyaudit.models.ExpertAgencies;
import com.anyaudit.models.FinancialFramework;
import com.anyaudit.repository.FinancialFrameworkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FinancialFrameworkManager {
    @Autowired
    private FinancialFrameworkRepository financialFrameworkRepository;


    public List<FinancialFramework> getAll() {
        return financialFrameworkRepository.findAll();
    }

    public String findNameById(Long id) {
        Optional<FinancialFramework> form = financialFrameworkRepository.findById(id);
        return form.map(FinancialFramework::getName).orElse(null);
    }
}
