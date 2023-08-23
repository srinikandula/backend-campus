package com.anyaudit.repository;

import com.anyaudit.models.ReconcileMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReconcileMasterRepository extends JpaRepository<ReconcileMaster,Long> {
}
