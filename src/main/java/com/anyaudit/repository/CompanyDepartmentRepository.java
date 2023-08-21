package com.anyaudit.repository;

import com.anyaudit.models.CompanyDepartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyDepartmentRepository extends JpaRepository<CompanyDepartment,Long> {
}
