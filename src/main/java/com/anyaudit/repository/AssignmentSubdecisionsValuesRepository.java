package com.anyaudit.repository;


import com.anyaudit.models.AssignmentDecisionValues;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentSubdecisionsValuesRepository extends JpaRepository<AssignmentDecisionValues,Long> {
}

