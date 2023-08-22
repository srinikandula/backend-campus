package com.anyaudit.repository;

import com.anyaudit.models.StandardDatas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StandardDatasRepository extends JpaRepository<StandardDatas,Long> {
}
