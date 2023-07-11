package com.anyaudit.repository;


import com.anyaudit.models.Classifier;
import com.anyaudit.models.Decisions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DecisionsRepository extends JpaRepository<Decisions, Long> {
    Optional<Decisions> findById(Long id);
}
