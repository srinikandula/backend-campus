package com.anyaudit.repository;

import com.anyaudit.models.TypesLeave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypesLeaveJavaRepository extends JpaRepository<TypesLeave, Long> {
}
