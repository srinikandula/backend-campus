package com.anyaudit.repository;

import com.anyaudit.models.ControlCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ControlCategoryJavaRepository extends JpaRepository<ControlCategory, Long> {
}
