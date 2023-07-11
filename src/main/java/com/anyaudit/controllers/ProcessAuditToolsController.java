package com.anyaudit.controllers;

import com.anyaudit.models.ChecklistsQuestionnairesForms;
import com.anyaudit.models.ProcessAuditTools;
import com.anyaudit.service.ProcessAuditToolsManager;
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
@RequestMapping("/api/processaudit")
public class ProcessAuditToolsController {

    @Autowired
    private ProcessAuditToolsManager processAuditToolsManager;

    @GetMapping("/list")
    public List<ProcessAuditTools> getAll() {
        return processAuditToolsManager.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findNameById(@PathVariable Long id) {
        String name = processAuditToolsManager.findNameById(id);
        if (name == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Name not found");
        } else {
            return ResponseEntity.ok().body("{\"name\": \"" + name + "\"}");
        }
    }
}
