package com.anyaudit.repository;

import com.anyaudit.models.StandardTextTemplate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StandardTextTemplateRepository extends JpaRepository<StandardTextTemplate,Long> {
}
