package com.anyaudit.repository;

import com.anyaudit.models.Annexures;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnexuresRepository extends JpaRepository<Annexures, Long> {
}
