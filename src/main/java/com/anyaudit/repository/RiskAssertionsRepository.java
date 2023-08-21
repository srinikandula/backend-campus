package com.anyaudit.repository;

import com.anyaudit.models.RiskAssertions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiskAssertionsRepository extends JpaRepository<RiskAssertions,Long> {
}
