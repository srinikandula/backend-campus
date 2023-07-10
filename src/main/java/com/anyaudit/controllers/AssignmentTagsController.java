package com.anyaudit.controllers;

import com.anyaudit.models.AssignmentTags;
import com.anyaudit.models.ExpertAgencies;
import com.anyaudit.service.AssignmentTagsManager;
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
@RequestMapping("/api/assignmenttags")
public class AssignmentTagsController {

    @Autowired
    private AssignmentTagsManager assignmentTagsManager;

    @GetMapping("/list")
    public ResponseEntity<List<AssignmentTags>> getAll() {
        List<AssignmentTags> plans = assignmentTagsManager.getAll();
        return ResponseEntity.ok(plans);
    }
}
