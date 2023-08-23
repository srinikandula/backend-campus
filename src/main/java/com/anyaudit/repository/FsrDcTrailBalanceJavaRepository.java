package com.anyaudit.repository;

import com.anyaudit.models.FsrDcTrailBalance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FsrDcTrailBalanceJavaRepository extends JpaRepository<FsrDcTrailBalance, Long> {
}
