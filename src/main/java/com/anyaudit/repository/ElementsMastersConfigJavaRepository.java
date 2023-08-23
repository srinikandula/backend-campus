package com.anyaudit.repository;

import com.anyaudit.models.ElementsMastersConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElementsMastersConfigJavaRepository extends JpaRepository<ElementsMastersConfig, Long> {
}
