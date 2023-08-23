package com.anyaudit.repository;

import com.anyaudit.models.ChecklistNodeTmp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChecklistNodeTmpJavaRepository extends JpaRepository<ChecklistNodeTmp, Long> {
}
