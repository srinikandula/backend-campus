package com.anyaudit.repository;

import com.anyaudit.models.AuditConclusionTemplateGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditConclusionTemplateGroupRepository  extends JpaRepository<AuditConclusionTemplateGroup,Long> {
}
