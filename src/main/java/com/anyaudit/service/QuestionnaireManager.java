package com.anyaudit.service;

import com.anyaudit.models.Plan;
import com.anyaudit.models.Questionnaire;
import com.anyaudit.models.StandardText;
import com.anyaudit.repository.QuestionnaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionnaireManager {
    @Autowired
    private QuestionnaireRepository questionnaireRepository;


    public List<Questionnaire> getAll() {
        return questionnaireRepository.findAll();
    }

    public Optional<Questionnaire> getbyID(Long id) {
        return questionnaireRepository.findById(id);
    }
}
