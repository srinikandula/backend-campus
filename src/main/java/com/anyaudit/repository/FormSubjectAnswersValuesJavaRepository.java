package com.anyaudit.repository;

import com.anyaudit.models.FormSubjectAnswersValues;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormSubjectAnswersValuesJavaRepository extends JpaRepository<FormSubjectAnswersValues, Long> {
}
