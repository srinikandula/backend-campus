package com.anyaudit.repository;

import com.anyaudit.models.Contactgroups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactgroupsRepository extends JpaRepository<Contactgroups,Long> {
}
