package com.anyaudit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.anyaudit.models.FssMasterTypesList;
import org.springframework.stereotype.Repository;

@Repository
public interface FssMasterTypesListJavaRepository extends JpaRepository<FssMasterTypesList, Long> {

}
