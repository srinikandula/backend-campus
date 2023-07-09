package com.anyaudit.repository;

import com.anyaudit.models.AuditPlanningTemplates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditPlanningTemplatesRepository extends JpaRepository<AuditPlanningTemplates, Long> {
}
