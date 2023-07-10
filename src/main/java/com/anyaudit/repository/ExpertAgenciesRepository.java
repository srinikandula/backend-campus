package com.anyaudit.repository;
import com.anyaudit.models.ExpertAgencies;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpertAgenciesRepository extends JpaRepository<ExpertAgencies, Long>{
}
