package com.anyaudit.repository;

import com.anyaudit.models.PermissionsAroupActivities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionsAroupActivitiesRepository extends JpaRepository<PermissionsAroupActivities,Long> {
}
