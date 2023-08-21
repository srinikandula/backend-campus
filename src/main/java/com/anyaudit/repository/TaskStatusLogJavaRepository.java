package com.anyaudit.repository;

import com.anyaudit.models.TaskStatusLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskStatusLogJavaRepository extends JpaRepository<TaskStatusLog, Long> {
}
