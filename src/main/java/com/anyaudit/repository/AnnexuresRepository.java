package com.anyaudit.repository;

import com.anyaudit.models.Annexures;
import com.anyaudit.models.Classifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AnnexuresRepository extends JpaRepository<Annexures, Long> {

    Optional<Annexures> findById(Long id);

}
