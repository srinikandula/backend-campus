package com.anyaudit.repository;

import com.anyaudit.models.Eventattachments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventattachmentsRepository extends JpaRepository<Eventattachments,Long> {
}
