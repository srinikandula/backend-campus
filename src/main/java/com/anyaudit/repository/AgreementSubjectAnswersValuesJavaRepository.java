package com.anyaudit.repository;

import com.anyaudit.models.AgreementSubjectAnswersValues;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgreementSubjectAnswersValuesJavaRepository extends JpaRepository<AgreementSubjectAnswersValues, Long> {
}
