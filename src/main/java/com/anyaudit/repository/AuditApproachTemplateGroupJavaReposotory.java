package com.anyaudit.repository;

import com.anyaudit.models.AuditApproachTemplateGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditApproachTemplateGroupJavaReposotory extends JpaRepository<AuditApproachTemplateGroup, Long> {

}
