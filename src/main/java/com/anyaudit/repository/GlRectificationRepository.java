package com.anyaudit.repository;

import com.anyaudit.models.GlRectification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlRectificationRepository extends JpaRepository<GlRectification,Long> {
}
