package com.anyaudit.repository;

import com.anyaudit.models.SubLedger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubLedgerRepository extends JpaRepository<SubLedger,Long> {
}
