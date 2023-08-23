package com.anyaudit.repository;
import com.anyaudit.models.Class;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassJavaRepository extends JpaRepository<Class, Long> {
}
