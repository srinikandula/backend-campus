package com.anyaudit.repository;

import com.anyaudit.models.ReviewNotes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewNotesRepository extends JpaRepository<ReviewNotes,Long> {
}
