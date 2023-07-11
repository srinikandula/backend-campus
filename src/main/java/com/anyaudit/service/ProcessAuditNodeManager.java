package com.anyaudit.service;

import com.anyaudit.models.ComplianceCalendar;
import com.anyaudit.models.ProcessAuditNode;
import com.anyaudit.models.Questionnaire;
import com.anyaudit.repository.ProcessAuditNodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProcessAuditNodeManager {
    @Autowired
    private ProcessAuditNodeRepository processAuditNodeRepository;

    public List<ProcessAuditNode> getAll() {
        return processAuditNodeRepository.findAll();
    }

    public Optional<ProcessAuditNode> getbyID(Long id) {
        return processAuditNodeRepository.findById(id);
    }
}
