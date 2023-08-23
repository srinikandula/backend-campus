package com.anyaudit.repository;

import com.anyaudit.models.ClassifierGroupList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassifierGroupListJavaRepository extends JpaRepository<ClassifierGroupList, Long> {
}
