package com.anyaudit.controllers;

import com.anyaudit.models.Conditions;
import com.anyaudit.models.Decisions;
import com.anyaudit.service.DecisionsManager;
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
@RequestMapping("/api/decision")
public class DecisionsController {
    @Autowired
    private DecisionsManager decisionsManager;


    @GetMapping("/list")
    public List<Decisions> getAll() {
        return decisionsManager.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findNameById(@PathVariable Long id) {
        String name = decisionsManager.findNameById(id);
        if (name == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Name not found");
        } else {
            return ResponseEntity.ok().body("{\"name\": \"" + name + "\"}");
        }
    }
}
