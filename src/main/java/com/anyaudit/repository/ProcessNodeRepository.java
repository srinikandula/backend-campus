package com.anyaudit.repository;

import com.anyaudit.models.ProcessNode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessNodeRepository extends JpaRepository<ProcessNode,Long> {
}
