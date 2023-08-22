package com.anyaudit.repository;

import com.anyaudit.models.EnquiryForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnquiryFormRepository extends JpaRepository<EnquiryForm,Long> {
}
