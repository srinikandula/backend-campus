package com.anyaudit.repository;

import com.anyaudit.models.DaFilters;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaFiltersJavaRepository extends JpaRepository<DaFilters, Long> {
}
