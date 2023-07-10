package com.anyaudit.repository;

import com.anyaudit.models.AuditConclusions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditConclusionsRepository extends JpaRepository<AuditConclusions,Long> {
}
