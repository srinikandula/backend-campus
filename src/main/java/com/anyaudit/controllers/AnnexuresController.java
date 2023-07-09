package com.anyaudit.controllers;

import com.anyaudit.models.Annexures;
import com.anyaudit.models.AuditPlanningTemplates;
import com.anyaudit.service.AnnexuresManager;
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
@RequestMapping("/api/annexures")

public class AnnexuresController {

    @Autowired
    private AnnexuresManager annexuresManager;

    @GetMapping("/list")
    public ResponseEntity<List<Annexures>> getAll() {
        List<Annexures> plans = annexuresManager.getAll();
        return ResponseEntity.ok(plans);
    }

}
