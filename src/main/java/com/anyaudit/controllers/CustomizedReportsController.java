package com.anyaudit.controllers;

import com.anyaudit.models.CustomizedReports;
import com.anyaudit.service.CustomizedReportsManager;
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
@RequestMapping("/api/customizedreports")
public class CustomizedReportsController {
    @Autowired
    private CustomizedReportsManager customizedReportsManager;

    @GetMapping("/list")
    public ResponseEntity<List<CustomizedReports>> getAll() {
        List<CustomizedReports> plans = customizedReportsManager.getAll();
        return ResponseEntity.ok(plans);
    }
}
