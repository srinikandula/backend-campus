package com.anyaudit.repository;

import com.anyaudit.models.ComplianceCalendar;import com.anyaudit.models.StandardizedReports;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StandardizedReportsRepository extends JpaRepository<StandardizedReports, Long> {
}
