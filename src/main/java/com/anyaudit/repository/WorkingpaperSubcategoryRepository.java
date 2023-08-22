package com.anyaudit.repository;

import com.anyaudit.models.WorkingpaperSubcategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkingpaperSubcategoryRepository extends JpaRepository<WorkingpaperSubcategory,Long> {

}
