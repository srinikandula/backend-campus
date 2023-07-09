package com.anyaudit.controllers;

import com.anyaudit.models.ComplianceCalendar;
import com.anyaudit.models.StandardizedReports;
import com.anyaudit.service.StandardizedReportsManager;
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
@RequestMapping("/api/standardizedreports")

public class StandardizedReportsController {
    @Autowired
    private StandardizedReportsManager standardizedReportsManager;

    @GetMapping("/list")
    public ResponseEntity<List<StandardizedReports>> getAll() {
        List<StandardizedReports> plans = standardizedReportsManager.getAll();
        return ResponseEntity.ok(plans);
    }
}
