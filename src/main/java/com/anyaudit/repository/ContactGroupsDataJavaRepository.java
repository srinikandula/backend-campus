package com.anyaudit.repository;

import com.anyaudit.models.ContactGroupsData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactGroupsDataJavaRepository extends JpaRepository<ContactGroupsData, Long> {
}
