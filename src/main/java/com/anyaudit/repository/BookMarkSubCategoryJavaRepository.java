package com.anyaudit.repository;

import com.anyaudit.models.BookMarkSubCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookMarkSubCategoryJavaRepository extends JpaRepository<BookMarkSubCategory, Long> {
}
