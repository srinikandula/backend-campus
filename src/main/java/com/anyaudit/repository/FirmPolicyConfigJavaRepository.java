package com.anyaudit.repository;

import com.anyaudit.models.FirmPolicyConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FirmPolicyConfigJavaRepository extends JpaRepository<FirmPolicyConfig, Long> {
}
