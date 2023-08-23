package com.anyaudit.repository;

import com.anyaudit.models.DcChartofaccounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DcChartofaccountsRepository extends JpaRepository<DcChartofaccounts,Long> {
}
