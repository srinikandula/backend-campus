package com.anyaudit.repository;

import com.anyaudit.models.GlReclassifications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlReclassificationsRepository extends JpaRepository<GlReclassifications,Long> {
}
