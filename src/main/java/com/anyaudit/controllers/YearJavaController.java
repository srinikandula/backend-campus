package com.anyaudit.controllers;


import com.anyaudit.models.YearJava;
import com.anyaudit.service.YearJavaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/year")
public class YearJavaController {

    @Autowired
    private YearJavaService yearJavaService;

    @GetMapping("/list")
    public List<YearJava> getAll() {
        return yearJavaService.getAllYear();
    }
}
