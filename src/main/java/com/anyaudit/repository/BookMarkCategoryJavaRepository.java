package com.anyaudit.repository;

import com.anyaudit.models.BookMarkCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookMarkCategoryJavaRepository extends JpaRepository<BookMarkCategory, LocMasterJavaRepository> {
}
