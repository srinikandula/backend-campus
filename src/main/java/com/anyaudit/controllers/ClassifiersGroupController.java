package com.anyaudit.controllers;

import com.anyaudit.models.ClassifiersGroup;
import com.anyaudit.models.ProcessAuditNode;
import com.anyaudit.service.ClassifiersGroupManager;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@Getter
@Setter
@RequestMapping("/api/classifiersgroup")
public class ClassifiersGroupController {
    @Autowired
    private ClassifiersGroupManager classifiersGroupManager;

    @GetMapping("/list")
    public List<ClassifiersGroup> getAll() {
        return classifiersGroupManager.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClassifiersGroup> getbyID(@PathVariable("id") Long id) {
        Optional<ClassifiersGroup> questionnaire = classifiersGroupManager.getbyID(id);
        return questionnaire.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

}
