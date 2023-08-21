package com.anyaudit.repository;

import com.anyaudit.models.PInvQuantitativeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PInvQuantitativeDetailsJavaRepository extends JpaRepository<PInvQuantitativeDetails, Long> {
}
