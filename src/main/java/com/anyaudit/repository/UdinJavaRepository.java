package com.anyaudit.repository;

import com.anyaudit.models.Udin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UdinJavaRepository extends JpaRepository<Udin, Long> {
}
