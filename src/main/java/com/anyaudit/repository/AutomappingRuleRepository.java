package com.anyaudit.repository;

import com.anyaudit.models.AutomappingRule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutomappingRuleRepository  extends JpaRepository<AutomappingRule,Long> {
}
