package com.anyaudit.controllers;

import com.anyaudit.models.AuditApproaches;
import com.anyaudit.models.AuditConclusions;
import com.anyaudit.service.AuditConclusionsManager;
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
@RequestMapping("/api/auditconclusion")
public class AuditConclusionsController {
    @Autowired
    private AuditConclusionsManager auditConclusionsManager;

    @GetMapping("/list")
    public ResponseEntity<List<AuditConclusions>> getAll() {
        List<AuditConclusions> plans = auditConclusionsManager.getAll();
        return ResponseEntity.ok(plans);
    }

}
