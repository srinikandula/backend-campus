package com.anyaudit.repository;

import com.anyaudit.models.ChecklistTypeSubjectAnswersValues;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChecklistTypeSubjectAnswersValuesJavaRepository extends JpaRepository<ChecklistTypeSubjectAnswersValues, Long> {
}
