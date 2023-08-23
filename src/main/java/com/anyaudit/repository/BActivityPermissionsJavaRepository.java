package com.anyaudit.repository;

import com.anyaudit.models.BActivityPermissions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BActivityPermissionsJavaRepository extends JpaRepository<BActivityPermissions, Long> {
}
