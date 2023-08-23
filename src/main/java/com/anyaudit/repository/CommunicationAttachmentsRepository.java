package com.anyaudit.repository;

import com.anyaudit.models.CommunicationAttachments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommunicationAttachmentsRepository extends JpaRepository<CommunicationAttachments,Long> {
}
