package com.anyaudit.repository;

import com.anyaudit.models.AuditConclusionTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditConclusionTemplateRepository extends JpaRepository<AuditConclusionTemplate,Long> {
}
