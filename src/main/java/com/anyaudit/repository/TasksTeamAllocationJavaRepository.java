package com.anyaudit.repository;

import com.anyaudit.models.TasksTeamAllocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TasksTeamAllocationJavaRepository extends JpaRepository<TasksTeamAllocation, Long> {
}
