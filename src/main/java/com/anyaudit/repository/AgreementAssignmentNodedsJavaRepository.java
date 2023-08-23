package com.anyaudit.repository;

import com.anyaudit.models.AgreementAssignmentNodeds;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgreementAssignmentNodedsJavaRepository extends JpaRepository<AgreementAssignmentNodeds, Long> {
}
