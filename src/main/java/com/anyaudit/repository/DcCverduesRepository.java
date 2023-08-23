package com.anyaudit.repository;

import com.anyaudit.models.DcCverdues;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DcCverduesRepository extends JpaRepository<DcCverdues,Long> {
}
