package com.anyaudit.repository;

import com.anyaudit.models.SubjectInterlinking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectInterlinkingJavaRepository extends JpaRepository<SubjectInterlinking, Long> {
}
