package com.anyaudit.repository;

import com.anyaudit.models.PopStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PopStatusJavaRepository extends JpaRepository<PopStatus, Long> {
}