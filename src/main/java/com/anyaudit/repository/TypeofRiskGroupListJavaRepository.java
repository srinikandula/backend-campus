package com.anyaudit.repository;

import com.anyaudit.models.TypeofRiskGroupList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeofRiskGroupListJavaRepository extends JpaRepository<TypeofRiskGroupList, Long> {
}
