package com.anyaudit.repository;

import com.anyaudit.models.FsrDiscloLeases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FsrDiscloLeasesJavaRepository extends JpaRepository<FsrDiscloLeases, Long> {
}
