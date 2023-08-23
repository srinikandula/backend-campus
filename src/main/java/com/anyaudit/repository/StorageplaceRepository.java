package com.anyaudit.repository;

import com.anyaudit.models.Storageplace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StorageplaceRepository extends JpaRepository<Storageplace,Long> {
}
