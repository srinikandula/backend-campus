package com.anyaudit.repository;

import com.anyaudit.models.AuditAssertion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditAssertionRepository extends JpaRepository<AuditAssertion, Integer> {

}
