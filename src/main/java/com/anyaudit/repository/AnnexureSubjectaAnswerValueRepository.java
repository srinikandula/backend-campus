package com.anyaudit.repository;

import com.anyaudit.models.AnnexureSubjectaAnswerValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnexureSubjectaAnswerValueRepository extends JpaRepository<AnnexureSubjectaAnswerValue,Long> {
}
