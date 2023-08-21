package com.anyaudit.repository;

import com.anyaudit.models.ScrutinyTextSearch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScrutinyTextSearchRepository extends JpaRepository<ScrutinyTextSearch,Long> {
}
