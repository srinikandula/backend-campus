package com.anyaudit.repository;

import com.anyaudit.models.FssMinors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FssMinorsJavaRepository extends JpaRepository<FssMinors, Long> {
}
