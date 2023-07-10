package com.anyaudit.repository;

import com.anyaudit.models.StandardText;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StandardTextRepository extends JpaRepository<StandardText,Long> {
}
