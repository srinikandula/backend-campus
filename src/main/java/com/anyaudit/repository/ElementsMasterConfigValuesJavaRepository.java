package com.anyaudit.repository;

import com.anyaudit.models.ElementsMasterConfigValues;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElementsMasterConfigValuesJavaRepository extends JpaRepository<ElementsMasterConfigValues, Long> {
}
