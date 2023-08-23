package com.anyaudit.repository;

import com.anyaudit.models.Tokens;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokensJavaRepository extends JpaRepository<Tokens, Long> {
}
