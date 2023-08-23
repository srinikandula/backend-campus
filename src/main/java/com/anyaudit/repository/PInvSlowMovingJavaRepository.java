package com.anyaudit.repository;

import com.anyaudit.models.PInvSlowMoving;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PInvSlowMovingJavaRepository extends JpaRepository<PInvSlowMoving, Long> {
}
