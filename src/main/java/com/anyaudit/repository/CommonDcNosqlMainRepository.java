package com.anyaudit.repository;

import com.anyaudit.models.CommonDcNosqlMain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommonDcNosqlMainRepository extends JpaRepository<CommonDcNosqlMain,Long> {
}
