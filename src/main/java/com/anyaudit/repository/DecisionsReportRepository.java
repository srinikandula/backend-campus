package com.anyaudit.repository;

import com.anyaudit.models.DecisionsReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DecisionsReportRepository extends JpaRepository <DecisionsReport,Long> {
}
