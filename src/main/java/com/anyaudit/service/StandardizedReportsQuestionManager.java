package com.anyaudit.service;

import com.anyaudit.models.StandardizedReports;
import com.anyaudit.models.StandardizedReportsQuestion;
import com.anyaudit.repository.StandardizedReportsQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Access;
import java.util.List;

@Service
public class StandardizedReportsQuestionManager {
    @Autowired
    private StandardizedReportsQuestionRepository standardizedReportsQuestionRepository;

    public List<StandardizedReportsQuestion> getAll() {
        return standardizedReportsQuestionRepository.findAll();
    }
}
