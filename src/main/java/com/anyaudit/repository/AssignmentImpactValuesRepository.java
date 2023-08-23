package com.anyaudit.repository;

import com.anyaudit.models.AssignmentImpactValues;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentImpactValuesRepository extends JpaRepository<AssignmentImpactValues,Long> {
}
