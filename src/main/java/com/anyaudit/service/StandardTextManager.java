package com.anyaudit.service;

import com.anyaudit.models.StandardText;
import com.anyaudit.models.WorkingPaper;
import com.anyaudit.repository.StandardTextRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StandardTextManager {
    @Autowired
    private StandardTextRepository standardTextRepository;

    public List<StandardText> getAll() {
        return standardTextRepository.findAll();
    }

}
