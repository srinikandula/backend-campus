package com.anyaudit.repository;

import com.anyaudit.models.FinancialFrameworkNode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinancialFrameworkNodeRepository extends JpaRepository<FinancialFrameworkNode,Long> {
}
