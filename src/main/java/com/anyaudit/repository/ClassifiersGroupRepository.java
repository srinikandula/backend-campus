package com.anyaudit.repository;

import com.anyaudit.models.ClassifiersGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassifiersGroupRepository extends JpaRepository <ClassifiersGroup,Long> {
}
