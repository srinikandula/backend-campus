package com.anyaudit.repository;

import com.anyaudit.models.Classifier;
import com.anyaudit.models.ProcessAuditTools;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClassifiersRepository extends JpaRepository<Classifier, Long> {
    Optional<Classifier> findById(Long id);
}
