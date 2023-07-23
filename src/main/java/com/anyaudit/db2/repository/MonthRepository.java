package com.anyaudit.db2.repository;

import com.anyaudit.db2.models.Year;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MonthRepository extends JpaRepository<Year,Long> {
    @Query(value = "SELECT COUNT(*) FROM assignment", nativeQuery = true)
        Long getClientCount();
}
