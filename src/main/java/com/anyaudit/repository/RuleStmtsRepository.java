package com.anyaudit.repository;

import com.anyaudit.models.RuleStmts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RuleStmtsRepository extends JpaRepository<RuleStmts,Long> {
}
