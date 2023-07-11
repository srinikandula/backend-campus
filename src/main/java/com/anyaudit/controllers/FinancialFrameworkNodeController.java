package com.anyaudit.controllers;

import com.anyaudit.models.FinancialFramework;
import com.anyaudit.models.FinancialFrameworkNode;
import com.anyaudit.service.FinancialFrameworkNodeManager;
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
@RequestMapping("/api/fframeworknode")
public class FinancialFrameworkNodeController {

    @Autowired
    private FinancialFrameworkNodeManager financialFrameworkNodeManager;
    @GetMapping("/list")
    public ResponseEntity<List<FinancialFrameworkNode>> getAll() {
        List<FinancialFrameworkNode> plans = financialFrameworkNodeManager.getAll();
        return ResponseEntity.ok(plans);
    }
}
