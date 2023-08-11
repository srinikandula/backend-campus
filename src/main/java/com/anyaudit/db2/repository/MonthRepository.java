package com.anyaudit.db2.repository;

import com.anyaudit.db2.models.sms_clients;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MonthRepository extends JpaRepository<sms_clients,Long>
{
    @Query(value = "SELECT client_name,client_id,client_email,client_pan,phone FROM sms_clients ", nativeQuery = true)
//        Long getClientCount();
    List<Object[]> getClientCount();
}

