package com.anyaudit.repository;


import com.anyaudit.models.WorkingPaper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkingPaperRepository extends JpaRepository <WorkingPaper, Long> {
}
