package com.anyaudit.repository;

import com.anyaudit.models.ElementsConfigTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElementsConfigTestJavaRepository extends JpaRepository<ElementsConfigTest, Long> {
}
