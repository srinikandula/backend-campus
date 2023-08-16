package com.anyaudit.controllers;

import com.anyaudit.models.TypeofAssignmentJava;
import com.anyaudit.models.YearJava;
import com.anyaudit.service.TypeofAssignmentJavaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/typeofAssign")
public class TypeofAssignmentJavaController {
    @Autowired
    private TypeofAssignmentJavaService typeofAssignmentJavaService;

    @GetMapping("/list")
    public List<TypeofAssignmentJava> getAll() {
        return typeofAssignmentJavaService.getAllType();
    }
}
