package com.anyaudit.repository;

import com.anyaudit.models.DomainGroupDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomainGroupDetailsJavaRepository extends JpaRepository<DomainGroupDetails, Long> {

}
