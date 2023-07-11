package com.anyaudit.controllers;

import com.anyaudit.models.Classifier;
import com.anyaudit.service.ClassifiersManager;
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
@RequestMapping("/api/classifier")
public class ClassifiersController {
    @Autowired
    private ClassifiersManager classifiersManager;


    @GetMapping("/list")
    public List<Classifier> getAll() {
        return classifiersManager.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findNameById(@PathVariable Long id) {
        String name = classifiersManager.findNameById(id);
        if (name == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Name not found");
        } else {
            return ResponseEntity.ok().body("{\"name\": \"" + name + "\"}");
        }
    }
}
