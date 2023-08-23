package com.anyaudit.repository;

import com.anyaudit.models.CommonDcNosqlMainMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommonDcNosqlMainMappingRepository extends JpaRepository<CommonDcNosqlMainMapping,Long> {
}
