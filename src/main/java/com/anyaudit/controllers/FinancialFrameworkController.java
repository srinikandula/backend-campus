package com.anyaudit.controllers;

import com.anyaudit.models.ExpertAgencies;
import com.anyaudit.models.FinancialFramework;
import com.anyaudit.service.FinancialFrameworkManager;
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
@RequestMapping("/api/fframework")
public class FinancialFrameworkController {
    @Autowired
    private FinancialFrameworkManager financialFrameworkManager;

    @GetMapping("/list")
    public ResponseEntity<List<FinancialFramework>> getAll() {
        List<FinancialFramework> plans = financialFrameworkManager.getAll();
        return ResponseEntity.ok(plans);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findNameById(@PathVariable Long id) {
        String name = financialFrameworkManager.findNameById(id);
        if (name == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Name not found");
        } else {
            return ResponseEntity.ok().body("{\"name\": \"" + name + "\"}");
        }
    }

}
