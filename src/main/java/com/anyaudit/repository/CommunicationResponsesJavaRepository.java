package com.anyaudit.repository;

import com.anyaudit.models.CommunicationResponses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommunicationResponsesJavaRepository extends JpaRepository<CommunicationResponses, Long> {
}
