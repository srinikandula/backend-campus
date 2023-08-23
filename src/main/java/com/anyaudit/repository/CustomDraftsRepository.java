package com.anyaudit.repository;

import com.anyaudit.models.CustomDrafts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomDraftsRepository extends JpaRepository<CustomDrafts,Long> {
}
