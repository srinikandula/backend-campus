package com.anyaudit.repository;

import com.anyaudit.models.GlGrouping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlGroupingJavaRepository extends JpaRepository<GlGrouping, Long> {
}
