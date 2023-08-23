package com.anyaudit.repository;

import com.anyaudit.models.CommunicationInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommunicationInfoJavaRepository extends JpaRepository<CommunicationInfo, Long> {
}
