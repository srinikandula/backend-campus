package com.anyaudit.repository;

import com.anyaudit.models.InsepectionAgency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsepectionAgencyRepository extends JpaRepository<InsepectionAgency,Long> {
}
