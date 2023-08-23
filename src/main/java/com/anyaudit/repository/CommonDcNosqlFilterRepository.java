package com.anyaudit.repository;

import com.anyaudit.models.CommonDcNosqlFilter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommonDcNosqlFilterRepository extends JpaRepository<CommonDcNosqlFilter,Long> {
}
