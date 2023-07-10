package com.anyaudit.service;

import com.anyaudit.models.ExpertAgencies;
import com.anyaudit.models.FinancialFramework;
import com.anyaudit.repository.FinancialFrameworkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinancialFrameworkManager {
    @Autowired
    private FinancialFrameworkRepository financialFrameworkRepository;


    public List<FinancialFramework> getAll() {
        return financialFrameworkRepository.findAll();
    }
}
