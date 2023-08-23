package com.anyaudit.repository;

import com.anyaudit.models.MasterVariableTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterVariableTemplateJavaRepository extends JpaRepository<MasterVariableTemplate, Long> {
}
