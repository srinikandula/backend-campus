package com.anyaudit.repository;

import com.anyaudit.models.Annexure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnexureJavaRepository extends JpaRepository<Annexure, Long> {

}
