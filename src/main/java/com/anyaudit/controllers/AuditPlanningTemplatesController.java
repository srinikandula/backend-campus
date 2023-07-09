package com.anyaudit.controllers;

import com.anyaudit.models.AuditPlanningTemplates;

import com.anyaudit.service.AuditPlanningTemplatesManager;
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
@RequestMapping("/api/auditplanning")
public class AuditPlanningTemplatesController {

    @Autowired
    private AuditPlanningTemplatesManager auditPlanningTemplatesManager;

    @GetMapping("/list")
    public ResponseEntity<List<AuditPlanningTemplates>> getAll() {
        List<AuditPlanningTemplates> plans = auditPlanningTemplatesManager.getAll();
        return ResponseEntity.ok(plans);
    }

}
