package com.anyaudit.repository;

import com.anyaudit.models.ComplianceCalendarSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComplianceCalendarScheduleRepository extends JpaRepository<ComplianceCalendarSchedule,Long> {
}
