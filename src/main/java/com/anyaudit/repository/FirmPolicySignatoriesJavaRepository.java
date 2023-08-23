package com.anyaudit.repository;

import com.anyaudit.models.FirmPolicySignatories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FirmPolicySignatoriesJavaRepository extends JpaRepository<FirmPolicySignatories, Long> {
}
