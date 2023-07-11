package com.anyaudit.controllers;

import com.anyaudit.models.CustomizedReports;
import com.anyaudit.models.CustomizedReportsDrafting;
import com.anyaudit.service.CustomizedReportsDraftingManager;
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
@RequestMapping("/api/customizedreportsDraft")
public class CustomizedReportsDraftingController {
    @Autowired
    private CustomizedReportsDraftingManager customizedReportsDraftingManager;

    @GetMapping("/list")
    public ResponseEntity<List<CustomizedReportsDrafting>> getAll() {
        List<CustomizedReportsDrafting> plans = customizedReportsDraftingManager.getAll();
        return ResponseEntity.ok(plans);
    }
}
