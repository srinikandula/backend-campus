package com.anyaudit.repository;

import com.anyaudit.models.DcLegalSuits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DcLegalSuitsJavaRepository extends JpaRepository<DcLegalSuits, Long> {
}
