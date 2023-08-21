package com.anyaudit.repository;

import com.anyaudit.models.FsrPrintText;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FsrPrintTextJavaRepository extends JpaRepository<FsrPrintText, Long> {
}
