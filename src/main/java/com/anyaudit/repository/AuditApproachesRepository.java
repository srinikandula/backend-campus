package com.anyaudit.repository;

import com.anyaudit.models.AuditApproaches;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditApproachesRepository extends JpaRepository<AuditApproaches,Long> {
}
