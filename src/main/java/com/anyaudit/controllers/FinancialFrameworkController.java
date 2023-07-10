package com.anyaudit.controllers;

import com.anyaudit.models.ExpertAgencies;
import com.anyaudit.models.FinancialFramework;
import com.anyaudit.service.FinancialFrameworkManager;
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
@RequestMapping("/api/fframework")
public class FinancialFrameworkController {
    @Autowired
    private FinancialFrameworkManager financialFrameworkManager;

    @GetMapping("/list")
    public ResponseEntity<List<FinancialFramework>> getAll() {
        List<FinancialFramework> plans = financialFrameworkManager.getAll();
        return ResponseEntity.ok(plans);
    }

}
