package com.anyaudit.repository;

import com.anyaudit.models.RiskRcm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiskRcmRepository extends JpaRepository<RiskRcm,Long> {
}
