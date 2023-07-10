package com.anyaudit.service;

import com.anyaudit.models.AuditApproaches;
import com.anyaudit.models.AuditConclusions;
import com.anyaudit.repository.AuditConclusionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditConclusionsManager {
    @Autowired
    private AuditConclusionsRepository auditConclusionsRepository;

    public List<AuditConclusions> getAll() {
        return auditConclusionsRepository.findAll();
    }
}
