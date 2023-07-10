package com.anyaudit.service;

import com.anyaudit.models.CustomAuditProcedures;
import com.anyaudit.models.CustomizedReports;
import com.anyaudit.repository.CustomAuditProceduresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomAuditProceduresManager {
    @Autowired
    private CustomAuditProceduresRepository customAuditProceduresRepository;

    public List<CustomAuditProcedures> getAll() {
        return customAuditProceduresRepository.findAll();
    }
}
