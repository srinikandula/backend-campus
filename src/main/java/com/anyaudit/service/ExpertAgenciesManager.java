package com.anyaudit.service;

import com.anyaudit.models.ExpertAgencies;

import com.anyaudit.repository.ExpertAgenciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpertAgenciesManager {

    @Autowired
    private ExpertAgenciesRepository expertAgenciesRepository;

    public List<ExpertAgencies> getAll() {
        return expertAgenciesRepository.findAll();
    }
}
