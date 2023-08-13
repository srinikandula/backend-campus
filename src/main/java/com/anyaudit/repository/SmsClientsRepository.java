package com.anyaudit.repository;


import com.anyaudit.models.SmsClients;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SmsClientsRepository extends JpaRepository<SmsClients,Integer> {
}
