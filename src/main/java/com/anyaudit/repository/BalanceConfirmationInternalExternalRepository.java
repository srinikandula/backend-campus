package com.anyaudit.repository;

import com.anyaudit.models.BalanceConfirmationInternalExternal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BalanceConfirmationInternalExternalRepository extends JpaRepository<BalanceConfirmationInternalExternal,Long> {
}
