package com.anyaudit.repository;

import com.anyaudit.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoJavaRepository extends JpaRepository<Todo, Long> {
}
