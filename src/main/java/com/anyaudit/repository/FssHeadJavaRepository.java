package com.anyaudit.repository;

import com.anyaudit.models.FssHead;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FssHeadJavaRepository extends JpaRepository<FssHead,Long> {
}
