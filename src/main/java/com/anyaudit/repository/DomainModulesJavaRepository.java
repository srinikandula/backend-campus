package com.anyaudit.repository;

import com.anyaudit.models.DomainModules;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomainModulesJavaRepository extends JpaRepository<DomainModules, Long> {
}
