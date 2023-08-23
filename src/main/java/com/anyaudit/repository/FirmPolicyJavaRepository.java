package com.anyaudit.repository;

import com.anyaudit.models.FirmPolicy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FirmPolicyJavaRepository extends JpaRepository<FirmPolicy, Long> {
}
