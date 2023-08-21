package com.anyaudit.repository;

import com.anyaudit.models.ZohoMeeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZohoMeetingJavaRepository extends JpaRepository<ZohoMeeting, Long> {
}
