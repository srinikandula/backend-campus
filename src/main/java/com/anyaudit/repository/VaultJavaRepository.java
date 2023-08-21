package com.anyaudit.repository;

import com.anyaudit.models.Vault;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaultJavaRepository extends JpaRepository<Vault, Long> {
}
