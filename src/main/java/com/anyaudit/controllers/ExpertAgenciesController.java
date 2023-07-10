package com.anyaudit.controllers;

import com.anyaudit.models.ExpertAgencies;
import com.anyaudit.models.StandardizedReports;
import com.anyaudit.service.ExpertAgenciesManager;
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
@RequestMapping("/api/epertggencies")
public class ExpertAgenciesController {
    @Autowired
    private ExpertAgenciesManager expertAgenciesManager;

    @GetMapping("/list")
    public ResponseEntity<List<ExpertAgencies>> getAll() {
        List<ExpertAgencies> plans = expertAgenciesManager.getAll();
        return ResponseEntity.ok(plans);
    }


}
