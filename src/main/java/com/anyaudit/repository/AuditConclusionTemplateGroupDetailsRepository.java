package com.anyaudit.repository;

import com.anyaudit.models.AuditConclusionTemplateGroupDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditConclusionTemplateGroupDetailsRepository extends JpaRepository<AuditConclusionTemplateGroupDetails,Long> {
}
