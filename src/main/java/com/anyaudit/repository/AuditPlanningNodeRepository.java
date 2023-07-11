package com.anyaudit.repository;

import com.anyaudit.models.AuditPlanningNode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditPlanningNodeRepository extends JpaRepository <AuditPlanningNode,Long> {
}
