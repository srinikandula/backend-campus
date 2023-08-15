package com.anyaudit.controllers;
import com.anyaudit.models.AssignmentJava;
import com.anyaudit.service.AssignmentJavaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/assignment")
public class AssignmentJavaController {
    @Autowired
    private AssignmentJavaService assignmentService;

    @PostMapping("/save")
    public ResponseEntity<AssignmentJava> createAssignment(@Valid @RequestBody AssignmentJava assignment) {
        AssignmentJava createdAssignment = assignmentService.saveAssignment(assignment);
        return new ResponseEntity<>(createdAssignment, HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<AssignmentJava>> getAllAssignments() {
        List<AssignmentJava> assignments = assignmentService.getAllAssignments();
        return new ResponseEntity<>(assignments, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AssignmentJava> getAssignmentById(@PathVariable Long id) {
        AssignmentJava assignment = assignmentService.getAssignmentById(id);
        if (assignment != null) {
            return new ResponseEntity<>(assignment, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("update/{id}")
    public ResponseEntity<AssignmentJava> updateAssignment(
            @PathVariable Long id, @Valid @RequestBody AssignmentJava updatedAssignment) {
        AssignmentJava assignment = assignmentService.updateAssignment(id, updatedAssignment);
        return new ResponseEntity<>(assignment, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAssignment(@PathVariable Long id) {
        assignmentService.deleteAssignment(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

