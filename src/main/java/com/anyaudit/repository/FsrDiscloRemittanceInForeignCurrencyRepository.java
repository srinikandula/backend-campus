package com.anyaudit.repository;

import com.anyaudit.models.FsrDiscloRemittanceInForeignCurrency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FsrDiscloRemittanceInForeignCurrencyRepository extends JpaRepository<FsrDiscloRemittanceInForeignCurrency,Long> {
}
