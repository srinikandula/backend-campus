package com.anyaudit.service;

import com.anyaudit.models.AnnexureField;
import com.anyaudit.models.ClassifiersGroup;
import com.anyaudit.repository.AnnexureFieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnexureFieldManager {
    @Autowired
    private AnnexureFieldRepository annexureFieldRepository;


    public List<AnnexureField> getAll() {
        return annexureFieldRepository.findAll();
    }
}
