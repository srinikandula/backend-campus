package com.anyaudit.repository;

import com.anyaudit.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryJavaRepository extends JpaRepository<Category, Long> {
}
