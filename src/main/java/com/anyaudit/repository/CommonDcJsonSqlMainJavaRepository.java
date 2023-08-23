package com.anyaudit.repository;

import com.anyaudit.models.CommonDcJsonSqlMain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommonDcJsonSqlMainJavaRepository extends JpaRepository<CommonDcJsonSqlMain, Long> {
}
