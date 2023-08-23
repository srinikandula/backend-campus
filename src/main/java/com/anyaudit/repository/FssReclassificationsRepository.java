package com.anyaudit.repository;

import com.anyaudit.models.FssReclassifications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FssReclassificationsRepository extends JpaRepository<FssReclassifications,Long> {
}
