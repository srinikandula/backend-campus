package com.anyaudit.controllers;


import com.anyaudit.models.ComplianceCalendar;
import com.anyaudit.service.ComplianceCalendarManager;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@Getter
@Setter
@RequestMapping("/api/compliancecalendar")
public class ComplianceCalendarController {


    @Autowired
    private ComplianceCalendarManager complianceCalendarManager;


    @GetMapping("/list")
    public ResponseEntity<List<ComplianceCalendar>> getAll() {
        List<ComplianceCalendar> plans = complianceCalendarManager.getAll();
        return ResponseEntity.ok(plans);
    }
}
