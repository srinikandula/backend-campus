package com.anyaudit.repository;

import com.anyaudit.models.Firm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FirmRepository extends JpaRepository<Firm,Long> {
}
