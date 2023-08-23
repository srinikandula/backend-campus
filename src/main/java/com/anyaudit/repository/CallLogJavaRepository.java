package com.anyaudit.repository;

import com.anyaudit.models.CallLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CallLogJavaRepository extends JpaRepository<CallLog, Long> {
}
