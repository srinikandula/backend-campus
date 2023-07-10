package com.anyaudit.controllers;

import com.anyaudit.models.CustomAuditProcedures;
import com.anyaudit.models.CustomizedReports;
import com.anyaudit.service.CustomAuditProceduresManager;
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
@RequestMapping("/api/CustomAuditProcedures")
public class CustomAuditProceduresController {
    @Autowired
    private CustomAuditProceduresManager customAuditProceduresManager;

    @GetMapping("/list")
    public ResponseEntity<List<CustomAuditProcedures>> getAll() {
        List<CustomAuditProcedures> plans = customAuditProceduresManager.getAll();
        return ResponseEntity.ok(plans);
    }

}
