package com.anyaudit.repository;

import com.anyaudit.models.FsrCsrParticulars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FsrCsrParticularsJavaRepository extends JpaRepository<FsrCsrParticulars, Long> {
}
