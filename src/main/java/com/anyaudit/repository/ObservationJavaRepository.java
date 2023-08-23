package com.anyaudit.repository;

import com.anyaudit.models.Observation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObservationJavaRepository extends JpaRepository<Observation, Long> {
}
