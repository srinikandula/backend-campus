package com.anyaudit.repository;

import com.anyaudit.models.TypeofControlGroups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeofControlGroupsJavaRepository extends JpaRepository<TypeofControlGroups, Long> {
}
