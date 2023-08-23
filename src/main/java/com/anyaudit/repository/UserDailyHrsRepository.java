package com.anyaudit.repository;

import com.anyaudit.models.UserDailyHrs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDailyHrsRepository extends JpaRepository<UserDailyHrs,Long> {
}
