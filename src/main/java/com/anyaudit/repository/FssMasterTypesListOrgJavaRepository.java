package com.anyaudit.repository;

import com.anyaudit.models.FssMasterTypesListOrg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FssMasterTypesListOrgJavaRepository extends JpaRepository<FssMasterTypesListOrg, Long> {
}
