package com.anyaudit.repository;

import com.anyaudit.models.Decisions;
import com.anyaudit.models.FinancialFramework;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FinancialFrameworkRepository extends JpaRepository<FinancialFramework,Long> {

    Optional<FinancialFramework> findById(Long id);
}
