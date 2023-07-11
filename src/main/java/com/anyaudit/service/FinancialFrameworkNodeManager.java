package com.anyaudit.service;

import com.anyaudit.models.FinancialFramework;
import com.anyaudit.models.FinancialFrameworkNode;
import com.anyaudit.repository.FinancialFrameworkNodeRepository;
import com.anyaudit.repository.FinancialFrameworkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinancialFrameworkNodeManager {
    @Autowired
    private FinancialFrameworkNodeRepository financialFrameworkRepository;

    public List<FinancialFrameworkNode> getAll() {
        return financialFrameworkRepository.findAll();
    }
}
