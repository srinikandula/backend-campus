package com.anyaudit.repository;

import com.anyaudit.models.LoginOtpHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginOtpHistoryRepository extends JpaRepository<LoginOtpHistory,Long> {
}
