package com.anyaudit.repository;

import com.anyaudit.models.AnnexureField;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnexureFieldRepository extends JpaRepository<AnnexureField,Long> {
}
