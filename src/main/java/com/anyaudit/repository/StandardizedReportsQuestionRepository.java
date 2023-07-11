package com.anyaudit.repository;

import com.anyaudit.models.StandardizedReportsQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StandardizedReportsQuestionRepository extends JpaRepository<StandardizedReportsQuestion,Long> {
}
