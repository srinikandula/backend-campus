package com.anyaudit.service;

import com.anyaudit.models.TermsJava;
import com.anyaudit.models.YearJava;
import com.anyaudit.repository.TermsJavaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TermsJavaService {
    @Autowired
    private TermsJavaRepository termsJavaRepository;


    public List<TermsJava> getAllTerms() {
        return termsJavaRepository.findAll();
    }
}
