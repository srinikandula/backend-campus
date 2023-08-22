package com.anyaudit.repository;

import com.anyaudit.models.RemittanceForeign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemittanceForeignRepository extends JpaRepository<RemittanceForeign,Long> {
}
