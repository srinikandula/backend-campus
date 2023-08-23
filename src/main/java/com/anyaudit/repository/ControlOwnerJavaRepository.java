package com.anyaudit.repository;

import com.anyaudit.models.ControlOwner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ControlOwnerJavaRepository extends JpaRepository<ControlOwner, Long> {
}
