package com.anyaudit.service;

import com.anyaudit.models.AssignmentTags;
import com.anyaudit.models.AuditApproaches;
import com.anyaudit.repository.AuditApproachesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditApproachesManager {
    @Autowired
    private AuditApproachesRepository auditApproachesRepository;

    public List<AuditApproaches> getAll() {
        return auditApproachesRepository.findAll();
    }
}
