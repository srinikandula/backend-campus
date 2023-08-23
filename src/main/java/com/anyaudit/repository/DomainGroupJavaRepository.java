package com.anyaudit.repository;
import com.anyaudit.models.DomainGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DomainGroupJavaRepository extends JpaRepository<DomainGroup, Long>{


}
