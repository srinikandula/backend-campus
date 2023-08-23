package com.anyaudit.repository;

import com.anyaudit.models.TrialBalanceLogs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrialBalanceLogsJavaRepository extends JpaRepository<TrialBalanceLogs, Long> {
}
