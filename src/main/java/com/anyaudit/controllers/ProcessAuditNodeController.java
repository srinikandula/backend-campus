package com.anyaudit.controllers;

import com.anyaudit.models.ProcessAuditNode;
import com.anyaudit.models.Questionnaire;
import com.anyaudit.service.ProcessAuditNodeManager;
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
@RequestMapping("/api/Processauditnode")

public class ProcessAuditNodeController {

    @Autowired
    private ProcessAuditNodeManager processAuditNodeManager;

    @GetMapping("/list")
    public List<ProcessAuditNode> getAll() {
        return processAuditNodeManager.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProcessAuditNode> getbyID(@PathVariable("id") Long id) {
        Optional<ProcessAuditNode> questionnaire = processAuditNodeManager.getbyID(id);
        return questionnaire.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
