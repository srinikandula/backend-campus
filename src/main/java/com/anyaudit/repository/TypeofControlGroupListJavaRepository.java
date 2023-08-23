package com.anyaudit.repository;

import com.anyaudit.models.TypeofControlGroupList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeofControlGroupListJavaRepository extends JpaRepository<TypeofControlGroupList, Long> {
}
