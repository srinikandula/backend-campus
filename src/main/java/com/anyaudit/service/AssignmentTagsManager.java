package com.anyaudit.service;

import com.anyaudit.models.AssignmentTags;
import com.anyaudit.models.ExpertAgencies;
import com.anyaudit.repository.AssignmentTagsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignmentTagsManager {
    @Autowired
    private AssignmentTagsRepository assignmentTagsRepository;


    public List<AssignmentTags> getAll() {
        return assignmentTagsRepository.findAll();
    }

}
