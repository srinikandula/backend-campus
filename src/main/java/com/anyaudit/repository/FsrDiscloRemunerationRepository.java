package com.anyaudit.repository;

import com.anyaudit.models.FsrDiscloRemuneration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FsrDiscloRemunerationRepository extends JpaRepository<FsrDiscloRemuneration,Long> {
}
