package com.anyaudit.repository;

import com.anyaudit.models.FsrDiscloCapacityProcessing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FsrDiscloCapacityProcessingJavaRepository extends JpaRepository<FsrDiscloCapacityProcessing, Long> {
}
