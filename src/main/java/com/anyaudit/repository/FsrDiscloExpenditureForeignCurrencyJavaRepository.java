package com.anyaudit.repository;

import com.anyaudit.models.FsrDiscloExpenditureForeignCurrency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FsrDiscloExpenditureForeignCurrencyJavaRepository extends JpaRepository<FsrDiscloExpenditureForeignCurrency, Long> {
}
