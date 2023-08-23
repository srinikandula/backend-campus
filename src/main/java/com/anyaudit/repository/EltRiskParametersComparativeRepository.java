package com.anyaudit.repository;

import com.anyaudit.models.EltRiskParametersComparative;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EltRiskParametersComparativeRepository extends JpaRepository<EltRiskParametersComparative,Long> {
}
