package com.anyaudit.repository;

import com.anyaudit.models.Storagemodule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoragemoduleRepository extends JpaRepository<Storagemodule,Long> {
}
