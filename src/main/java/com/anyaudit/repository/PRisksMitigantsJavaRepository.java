package com.anyaudit.repository;

import com.anyaudit.models.PRisksMitigants;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PRisksMitigantsJavaRepository extends JpaRepository<PRisksMitigants, Long> {

}
