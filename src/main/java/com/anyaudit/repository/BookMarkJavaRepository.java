package com.anyaudit.repository;

import com.anyaudit.models.BookMark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookMarkJavaRepository extends JpaRepository<BookMark, Long> {
}
