package com.anyaudit.service;

import com.anyaudit.models.ExpertAgencies;
import com.anyaudit.models.WorkingPaper;
import com.anyaudit.repository.WorkingPaperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkingPaperManager {
    @Autowired
    private WorkingPaperRepository workingPaperRepository;


    public List<WorkingPaper> getAll() {
        return workingPaperRepository.findAll();
    }
}
