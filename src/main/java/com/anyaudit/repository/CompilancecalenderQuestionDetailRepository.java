package com.anyaudit.repository;

import com.anyaudit.models.CompilancecalenderQuestionDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompilancecalenderQuestionDetailRepository extends JpaRepository<CompilancecalenderQuestionDetail,Long> {
}
