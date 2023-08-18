package com.anyaudit.repository;

import com.anyaudit.models.WorkingPaperSubCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkingPaperSubCategoryJavaRepository extends JpaRepository<WorkingPaperSubCategory, Long> {

}
