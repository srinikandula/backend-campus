package com.anyaudit.repository;

import com.anyaudit.models.SmsGroupsDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmsGroupsDetailsJavaRepository extends JpaRepository<SmsGroupsDetails, Long> {
}
