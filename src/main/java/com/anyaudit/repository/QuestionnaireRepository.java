package com.anyaudit.repository;

import com.anyaudit.models.Questionnaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionnaireRepository extends JpaRepository <Questionnaire,Long>{
}
