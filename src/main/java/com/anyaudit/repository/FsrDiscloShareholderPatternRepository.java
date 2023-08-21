package com.anyaudit.repository;

import com.anyaudit.models.FsrDiscloShareholderPattern;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FsrDiscloShareholderPatternRepository extends JpaRepository<FsrDiscloShareholderPattern,Long> {
}
