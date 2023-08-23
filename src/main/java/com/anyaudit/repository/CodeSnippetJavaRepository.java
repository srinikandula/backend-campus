package com.anyaudit.repository;

import com.anyaudit.models.CodeSnippet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodeSnippetJavaRepository extends JpaRepository<CodeSnippet, Long> {
}
