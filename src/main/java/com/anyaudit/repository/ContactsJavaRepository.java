package com.anyaudit.repository;

import com.anyaudit.models.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactsJavaRepository extends JpaRepository<Contacts, Long> {
}
