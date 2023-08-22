package com.anyaudit.repository;

import com.anyaudit.models.ComplianceCalendarQuestions;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComplianceCalendarQuestionsRepository extends JpaRepository<ComplianceCalendarQuestions,Long> {
}
