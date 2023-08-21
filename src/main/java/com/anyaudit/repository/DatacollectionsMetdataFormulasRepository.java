package com.anyaudit.repository;

import com.anyaudit.models.DatacollectionsMetdataFormulas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatacollectionsMetdataFormulasRepository extends JpaRepository<DatacollectionsMetdataFormulas,Long>{
}
