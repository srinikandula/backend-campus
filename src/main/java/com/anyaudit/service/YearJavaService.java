package com.anyaudit.service;

import com.anyaudit.models.YearJava;
import com.anyaudit.repository.YearJavaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YearJavaService {
    @Autowired
    private YearJavaRepository yearJavaRepository;

    public List<YearJava> getAllYear() {
        return yearJavaRepository.findAll();
    }

}
