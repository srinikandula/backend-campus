package com.anyaudit.repository;

import com.anyaudit.models.CustomAuditProcedures;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomAuditProceduresRepository extends JpaRepository<CustomAuditProcedures,Long> {
}
