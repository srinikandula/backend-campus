package com.anyaudit.repository;

import com.anyaudit.models.DaCollection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaCollectionJavaRepository extends JpaRepository<DaCollection, Long> {
}
