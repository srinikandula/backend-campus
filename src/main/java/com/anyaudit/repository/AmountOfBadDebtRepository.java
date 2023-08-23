package com.anyaudit.repository;

import com.anyaudit.models.AmountOfBadDebt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmountOfBadDebtRepository extends JpaRepository<AmountOfBadDebt,Long> {
}
