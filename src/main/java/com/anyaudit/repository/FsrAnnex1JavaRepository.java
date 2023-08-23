package com.anyaudit.repository;

import com.anyaudit.models.FsrAnnex1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FsrAnnex1JavaRepository extends JpaRepository<FsrAnnex1, Long> {
}
