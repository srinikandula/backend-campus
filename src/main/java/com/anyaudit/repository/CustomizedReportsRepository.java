package com.anyaudit.repository;

import com.anyaudit.models.Annexures;
import com.anyaudit.models.CustomizedReports;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomizedReportsRepository extends JpaRepository <CustomizedReports,Long> {
    Optional<CustomizedReports> findById(Long id);
}
