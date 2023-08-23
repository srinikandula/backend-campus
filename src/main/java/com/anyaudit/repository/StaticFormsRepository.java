package com.anyaudit.repository;

import com.anyaudit.models.StaticForms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaticFormsRepository extends JpaRepository<StaticForms,Long> {
}
