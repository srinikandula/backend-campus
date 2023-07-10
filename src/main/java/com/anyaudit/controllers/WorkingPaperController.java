package com.anyaudit.controllers;

import com.anyaudit.models.ExpertAgencies;
import com.anyaudit.models.WorkingPaper;
import com.anyaudit.service.WorkingPaperManager;
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
@RequestMapping("/api/workingpaper")
public class WorkingPaperController {
    @Autowired
    private WorkingPaperManager workingPaperManager;

    @GetMapping("/list")
    public ResponseEntity<List<WorkingPaper>> getAll() {
        List<WorkingPaper> plans = workingPaperManager.getAll();
        return ResponseEntity.ok(plans);
    }

}
