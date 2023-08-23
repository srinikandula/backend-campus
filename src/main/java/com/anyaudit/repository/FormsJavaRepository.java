package com.anyaudit.repository;

import com.anyaudit.models.Forms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormsJavaRepository extends JpaRepository<Forms, Long> {
}
