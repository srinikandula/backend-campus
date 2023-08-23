package com.anyaudit.repository;

import com.anyaudit.models.ClassifierGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassifierGroupJavaRepository extends JpaRepository<ClassifierGroup, Long> {
}
