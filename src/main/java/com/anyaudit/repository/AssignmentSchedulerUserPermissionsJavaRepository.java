package com.anyaudit.repository;

import com.anyaudit.models.AssignmentSchedulerUserPermissions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentSchedulerUserPermissionsJavaRepository extends JpaRepository<AssignmentSchedulerUserPermissions, Long> {
}
