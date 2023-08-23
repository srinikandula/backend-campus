package com.anyaudit.repository;

import com.anyaudit.models.EmployeeBenefits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeBenefitsJavaRepository extends JpaRepository<EmployeeBenefits, Long> {
}
