package com.anyaudit.repository;

import com.anyaudit.models.CustomizedReportsDrafting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomizedReportsDraftingRepository extends JpaRepository<CustomizedReportsDrafting,Long> {
}
