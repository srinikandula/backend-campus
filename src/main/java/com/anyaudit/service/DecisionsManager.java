package com.anyaudit.service;

import com.anyaudit.models.Classifier;
import com.anyaudit.models.Decisions;
import com.anyaudit.models.ProcessAuditTools;
import com.anyaudit.repository.DecisionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DecisionsManager {
    @Autowired
    private DecisionsRepository decisionsRepository;

    public List<Decisions> getAll() {
        List<com.anyaudit.models.Decisions> assignments = decisionsRepository.findAll();
        List<Decisions> result = new ArrayList<>();
        for (com.anyaudit.models.Decisions c : assignments) {
            Decisions assignment = new Decisions();
            assignment.setId(c.getId());
            assignment.setName(c.getName());
            assignment.setDescription(c.getDescription());
            assignment.setType(c.getType());
            assignment.setChapter(c.getChapter());
            assignment.setCreatedBy(c.getCreatedBy());
            assignment.setUpdatedBy(c.getUpdatedBy());
            assignment.setCreatedDate(c.getCreatedDate());
            assignment.setUpdatedDate(c.getUpdatedDate());

            result.add(assignment);
        }
        return result;
    }
    public String findNameById(Long id) {
        Optional<Decisions> form = decisionsRepository.findById(id);
        return form.map(Decisions::getName).orElse(null);
    }
}
