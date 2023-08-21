package com.anyaudit.repository;

import com.anyaudit.models.VaultLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaultLogJavaRepository extends JpaRepository<VaultLog, Long> {
}
