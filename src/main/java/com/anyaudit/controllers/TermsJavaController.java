package com.anyaudit.controllers;

import com.anyaudit.models.TermsJava;
import com.anyaudit.models.YearJava;
import com.anyaudit.service.TermsJavaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/terms")
public class TermsJavaController {

    @Autowired
    private TermsJavaService termsJavaService;

    @GetMapping("/list")
    public List<TermsJava> getAll() {
        return termsJavaService.getAllTerms();
    }
}
