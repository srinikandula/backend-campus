package com.anyaudit.repository;

import com.anyaudit.models.ActivityLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityLogRepository  extends JpaRepository<ActivityLog,Long> {
}
