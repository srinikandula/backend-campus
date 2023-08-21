package com.anyaudit.repository;

import com.anyaudit.models.VoucherMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoucherMasterJavaRepository extends JpaRepository<VoucherMaster, Long> {
}
