package com.anyaudit.repository;

import com.anyaudit.models.Rules;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RulesRepository extends JpaRepository<Rules,Long> {
}
