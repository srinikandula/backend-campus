package com.anyaudit.repository;

import com.anyaudit.models.FssRatios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FssRatiosRepository extends JpaRepository<FssRatios,Long> {
}
