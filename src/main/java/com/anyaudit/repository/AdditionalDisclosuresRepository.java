package com.anyaudit.repository;

import com.anyaudit.models.AdditionalDisclosures;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdditionalDisclosuresRepository extends JpaRepository<AdditionalDisclosures,Long> {
}
