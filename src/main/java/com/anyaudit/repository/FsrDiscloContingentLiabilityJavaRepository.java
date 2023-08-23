package com.anyaudit.repository;

import com.anyaudit.models.FsrDiscloContingentLiability;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FsrDiscloContingentLiabilityJavaRepository extends JpaRepository<FsrDiscloContingentLiability, Long> {
}
