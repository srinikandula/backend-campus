package com.anyaudit.repository;

import com.anyaudit.models.FinancialFramework;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinancialFrameworkRepository extends JpaRepository<FinancialFramework,Long> {
}
