package com.anyaudit.controllers;


import com.anyaudit.models.ChecklistsQuestionnairesForms;
import com.anyaudit.models.Client;
import com.anyaudit.service.ChecklistsQuestionnairesFormsManager;
import com.anyaudit.service.ClientManager;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@Getter
@Setter
@RequestMapping("/api/CLQF")
public class ChecklistsQuestionnairesFormsController {

    @Autowired
    private ChecklistsQuestionnairesFormsManager checklistsQuestionnairesFormsManager;

    @GetMapping("/list")
    public List<ChecklistsQuestionnairesForms> getAllCLQF() {
        return checklistsQuestionnairesFormsManager.getAllCLQF();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findNameById(@PathVariable Long id) {
        String name = checklistsQuestionnairesFormsManager.findNameById(id);
        if (name == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Name not found");
        } else {
            return ResponseEntity.ok().body("{\"name\": \"" + name + "\"}");
        }
    }
}
