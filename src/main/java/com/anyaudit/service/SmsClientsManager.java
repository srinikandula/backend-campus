package com.anyaudit.service;

import com.anyaudit.models.SmsClients;
import com.anyaudit.repository.SmsClientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SmsClientsManager {

    @Autowired
    private SmsClientsRepository smsClientsRepository;


    public List<SmsClients> getAllSmsClients() {
        return smsClientsRepository.findAll();
    }

}
