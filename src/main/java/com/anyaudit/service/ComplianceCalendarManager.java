package com.anyaudit.service;

import com.anyaudit.models.AuditPlanningTemplates;
import com.anyaudit.models.ComplianceCalendar;
import com.anyaudit.repository.ComplianceCalendarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComplianceCalendarManager {
    @Autowired
    private ComplianceCalendarRepository complianceCalendarRepository;

    public List<ComplianceCalendar> getAll() {
        return complianceCalendarRepository.findAll();
    }
}
