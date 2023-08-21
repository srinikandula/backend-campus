package com.anyaudit.repository;

import com.anyaudit.models.FsrDiscloEmployeeBenfitsCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FsrDiscloEmployeeBenfitsCategoryJavaRepository extends JpaRepository<FsrDiscloEmployeeBenfitsCategory, Long> {
}
