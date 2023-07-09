package com.anyaudit.service;

import com.anyaudit.models.AuditPlanningTemplates;

import com.anyaudit.repository.AuditPlanningTemplatesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditPlanningTemplatesManager {
    @Autowired
    private AuditPlanningTemplatesRepository auditPlanningTemplatesRepository;

    public List<AuditPlanningTemplates> getAll() {
        return auditPlanningTemplatesRepository.findAll();
    }
}
