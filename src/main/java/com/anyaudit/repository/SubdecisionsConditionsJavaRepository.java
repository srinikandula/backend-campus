package com.anyaudit.repository;

import com.anyaudit.models.SubdecisionsConditions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubdecisionsConditionsJavaRepository extends JpaRepository<SubdecisionsConditions, Long> {


}
