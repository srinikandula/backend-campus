package com.anyaudit.repository;

import com.anyaudit.models.Remainder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemainderJavaRepository extends JpaRepository<Remainder, Long> {

}
