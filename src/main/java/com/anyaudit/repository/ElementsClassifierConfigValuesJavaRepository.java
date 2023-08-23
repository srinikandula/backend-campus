package com.anyaudit.repository;

import com.anyaudit.models.ElementsClassifierConfigValues;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElementsClassifierConfigValuesJavaRepository extends JpaRepository<ElementsClassifierConfigValues, Long> {
}
