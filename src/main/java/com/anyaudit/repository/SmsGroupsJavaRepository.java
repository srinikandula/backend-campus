package com.anyaudit.repository;

import com.anyaudit.models.SmsGroups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmsGroupsJavaRepository extends JpaRepository<SmsGroups, Long> {
}
