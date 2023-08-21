package com.anyaudit.repository;

import com.anyaudit.models.FssParameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FssParameterRepository extends JpaRepository<FssParameter,Long> {
}
