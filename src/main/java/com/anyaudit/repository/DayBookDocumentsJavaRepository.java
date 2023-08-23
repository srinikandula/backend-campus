package com.anyaudit.repository;

import com.anyaudit.models.DayBookDocuments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DayBookDocumentsJavaRepository extends JpaRepository<DayBookDocuments, Long> {
}
