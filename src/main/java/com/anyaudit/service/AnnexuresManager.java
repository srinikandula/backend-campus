package com.anyaudit.service;

import com.anyaudit.models.Annexures;
import com.anyaudit.models.AuditPlanningTemplates;
import com.anyaudit.models.Classifier;
import com.anyaudit.repository.AnnexuresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnnexuresManager {
    @Autowired
    private AnnexuresRepository annexuresRepository;


    public List<Annexures> getAll() {
        return annexuresRepository.findAll();
    }

    public String findNameById(Long id) {
        Optional<Annexures> form = annexuresRepository.findById(id);
        return form.map(Annexures::getName).orElse(null);
    }
}
