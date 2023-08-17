package com.anyaudit.repository;

import com.anyaudit.models.Milestone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MileStoneRepository extends JpaRepository<Milestone, Long> {

}
