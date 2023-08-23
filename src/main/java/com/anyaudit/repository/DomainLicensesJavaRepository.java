package com.anyaudit.repository;

import com.anyaudit.models.DomainLicenses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomainLicensesJavaRepository extends JpaRepository<DomainLicenses, Long> {
}
