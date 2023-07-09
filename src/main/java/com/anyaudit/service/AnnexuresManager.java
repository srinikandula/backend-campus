package com.anyaudit.service;

import com.anyaudit.models.Annexures;
import com.anyaudit.models.AuditPlanningTemplates;
import com.anyaudit.repository.AnnexuresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnexuresManager {
    @Autowired
    private AnnexuresRepository annexuresRepository;


    public List<Annexures> getAll() {
        return annexuresRepository.findAll();
    }
}
