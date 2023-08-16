package com.anyaudit.service;

import com.anyaudit.models.TypeofAssignmentJava;
import com.anyaudit.models.YearJava;
import com.anyaudit.repository.TypeofAssignmentJavaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeofAssignmentJavaService {
    @Autowired
    private TypeofAssignmentJavaRepository typeofAssignmentJavaRepository;

    public List<TypeofAssignmentJava> getAllType() {
        return typeofAssignmentJavaRepository.findAll();
    }
}
