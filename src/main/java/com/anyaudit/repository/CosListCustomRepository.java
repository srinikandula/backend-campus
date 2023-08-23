package com.anyaudit.repository;

import com.anyaudit.models.CosListCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CosListCustomRepository extends JpaRepository<CosListCustom, List>{
}
