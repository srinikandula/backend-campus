package com.anyaudit.controllers;

import com.anyaudit.models.StandardizedReports;
import com.anyaudit.models.StandardizedReportsQuestion;
import com.anyaudit.service.StandardizedReportsQuestionManager;
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
@RequestMapping("/api/standardizedreportsquestion")
public class StandardizedReportsQuestionController {

    @Autowired
    private StandardizedReportsQuestionManager standardizedReportsQuestionManager;


    @GetMapping("/list")
    public ResponseEntity<List<StandardizedReportsQuestion>> getAll() {
        List<StandardizedReportsQuestion> plans = standardizedReportsQuestionManager.getAll();
        return ResponseEntity.ok(plans);
    }
}
