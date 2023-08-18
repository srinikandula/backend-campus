package com.anyaudit.repository;

import com.anyaudit.models.SmsWorkUpdates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmsWorkUpdatesRepository extends JpaRepository<SmsWorkUpdates,Long> {
}
