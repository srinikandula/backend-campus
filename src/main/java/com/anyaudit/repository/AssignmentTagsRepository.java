package com.anyaudit.repository;

import com.anyaudit.models.AssignmentTags;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentTagsRepository extends JpaRepository<AssignmentTags,Long> {
}
