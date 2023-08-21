package com.anyaudit.repository;

import com.anyaudit.models.UdinQsnAnswers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UdinQsnAnswersJavaRepository extends JpaRepository<UdinQsnAnswers, Long> {
}
