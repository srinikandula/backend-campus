package com.anyaudit.service;

import com.anyaudit.models.AdditionalDisclosures;
import com.anyaudit.models.AssignmentTags;
import com.anyaudit.repository.AdditionalDisclosuresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdditionalDisclosuresManager {
    @Autowired
    private AdditionalDisclosuresRepository additionalDisclosuresRepository;

    public List<AdditionalDisclosures> getAll() {
        return additionalDisclosuresRepository.findAll();
    }

}
