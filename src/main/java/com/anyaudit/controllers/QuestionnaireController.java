package com.anyaudit.controllers;

import com.anyaudit.models.Plan;
import com.anyaudit.models.Questionnaire;
import com.anyaudit.models.TemplateforRisks;
import com.anyaudit.service.QuestionnaireManager;
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
@RequestMapping("/api/questionnaire")
public class QuestionnaireController {
    @Autowired
    private QuestionnaireManager questionnaireManager;

    @GetMapping("/list")
    public List<Questionnaire> getAll() {
        return questionnaireManager.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Questionnaire> getbyID(@PathVariable("id") Long id) {
        Optional<Questionnaire> questionnaire = questionnaireManager.getbyID(id);
        return questionnaire.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
