package com.anyaudit.controllers;

import com.anyaudit.models.AssignmentTags;
import com.anyaudit.models.AuditApproaches;
import com.anyaudit.service.AuditApproachesManager;
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
@RequestMapping("/api/auditapproaches")
public class AuditApproachesController {

    @Autowired
    private AuditApproachesManager auditApproachesManager;


    @GetMapping("/list")
    public ResponseEntity<List<AuditApproaches>> getAll() {
        List<AuditApproaches> plans = auditApproachesManager.getAll();
        return ResponseEntity.ok(plans);
    }
}
