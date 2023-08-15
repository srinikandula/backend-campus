package com.anyaudit.service;

import com.anyaudit.models.AssignmentJava;
import com.anyaudit.repository.AssignmentJavaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
@Service
public class AssignmentJavaService {
    @Autowired
    private AssignmentJavaRepository assignmentRepository;



    public AssignmentJava saveAssignment(AssignmentJava assignment) {
        return assignmentRepository.save(assignment);
    }

    public List<AssignmentJava> getAllAssignments() {
        return assignmentRepository.findAll();
    }

    public AssignmentJava getAssignmentById(Long id) {
        return assignmentRepository.findById(id).orElse(null);
    }
    public AssignmentJava updateAssignment(Long assignmentId, AssignmentJava updatedAssignment) {
        AssignmentJava existingAssignment = assignmentRepository.findById(assignmentId)
                .orElseThrow(() -> new EntityNotFoundException("Assignment not found"));


        existingAssignment.setAssignmentName(updatedAssignment.getAssignmentName());
        existingAssignment.setEngagementPartner(updatedAssignment.getEngagementPartner());
        existingAssignment.setTypeofAssignment(updatedAssignment.getTypeofAssignment());
        existingAssignment.setClient(updatedAssignment.getClient());
        existingAssignment.setFramework(updatedAssignment.getFramework());
        existingAssignment.setYear(updatedAssignment.getYear());
        existingAssignment.setTerms(updatedAssignment.getTerms());

        return assignmentRepository.save(existingAssignment);
    }

    public void deleteAssignment(Long id) {
        assignmentRepository.deleteById(id);
    }
}
