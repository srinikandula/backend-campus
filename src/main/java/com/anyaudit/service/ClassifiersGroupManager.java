package com.anyaudit.service;

import com.anyaudit.models.ClassifiersGroup;
import com.anyaudit.models.ProcessAuditNode;
import com.anyaudit.repository.ClassifiersGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassifiersGroupManager {
    @Autowired
    private ClassifiersGroupRepository classifiersGroupRepository;

    public List<ClassifiersGroup> getAll() {
        return classifiersGroupRepository.findAll();
    }

    public Optional<ClassifiersGroup> getbyID(Long id) {
        return classifiersGroupRepository.findById(id);
    }
}
