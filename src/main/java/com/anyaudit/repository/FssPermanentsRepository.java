package com.anyaudit.repository;

import com.anyaudit.models.FssPermanents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FssPermanentsRepository extends JpaRepository<FssPermanents,Long> {
}
