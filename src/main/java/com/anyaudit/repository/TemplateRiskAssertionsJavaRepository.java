package com.anyaudit.repository;

import com.anyaudit.models.TemplateRiskAssertions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemplateRiskAssertionsJavaRepository extends JpaRepository<TemplateRiskAssertions, Long> {
}
