package com.anyaudit.repository;

import com.anyaudit.models.FsrPrintTables;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FsrPrintTablesJavaRepository extends JpaRepository<FsrPrintTables, Long> {
}
