package com.anyaudit.repository;

import com.anyaudit.models.GlTrialBalance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlTrialBalanceRepository extends JpaRepository<GlTrialBalance,Long> {
}
