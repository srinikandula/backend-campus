package com.anyaudit.repository;

import com.anyaudit.models.RemainderPerformance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemainderPerformanceRepository extends JpaRepository<RemainderPerformance,Long> {
}
