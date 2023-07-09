package com.anyaudit.repository;

import com.anyaudit.models.ComplianceCalendar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ComplianceCalendarRepository extends JpaRepository<ComplianceCalendar, Long>{
}
