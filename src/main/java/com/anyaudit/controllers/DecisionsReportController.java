package com.anyaudit.controllers;

import com.anyaudit.models.DecisionsReport;
import com.anyaudit.models.ProcessAuditNode;
import com.anyaudit.service.DecisionsReportManager;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@Getter
@Setter
@RequestMapping("/api/decisionsreport")
public class DecisionsReportController {
    @Autowired
    private DecisionsReportManager decisionsReportManager;

    @GetMapping("/list")
    public List<DecisionsReport> getAll() {
        return decisionsReportManager.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DecisionsReport> getbyID(@PathVariable("id") Long id) {
        Optional<DecisionsReport> questionnaire = decisionsReportManager.getbyID(id);
        return questionnaire.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
