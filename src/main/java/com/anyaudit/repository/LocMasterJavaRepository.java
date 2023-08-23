package com.anyaudit.repository;

import com.anyaudit.models.LocMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocMasterJavaRepository extends JpaRepository<LocMaster, Long> {
}
