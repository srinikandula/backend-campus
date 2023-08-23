package com.anyaudit.repository;

import com.anyaudit.models.AuditMateriality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditMaterialityRepository extends JpaRepository<AuditMateriality,Long> {
}
