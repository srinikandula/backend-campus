package com.anyaudit.repository;

import com.anyaudit.models.AuditApproachTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditApproachTemplateJavaRepository extends JpaRepository<AuditApproachTemplate, Long> {
}
