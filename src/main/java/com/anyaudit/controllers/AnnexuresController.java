package com.anyaudit.controllers;

import com.anyaudit.models.Annexures;
import com.anyaudit.models.AuditPlanningTemplates;
import com.anyaudit.service.AnnexuresManager;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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


    @GetMapping("/{id}")
    public ResponseEntity<?> findNameById(@PathVariable Long id) {
        String name = annexuresManager.findNameById(id);
        if (name == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Name not found");
        } else {
            return ResponseEntity.ok().body("{\"name\": \"" + name + "\"}");
        }
    }
}
