package com.anyaudit.service;

import com.anyaudit.dto.SmsClientsDTO;
import com.anyaudit.models.SmsClients;
import com.anyaudit.repository.SmsClientsRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class SmsClientsManager {
    @Autowired
    private SmsClientsRepository smsClientsRepository;




//    public SmsClientsManager(SmsClientsRepository smsClientsRepository) {
//        this.smsClientsRepository = smsClientsRepository;
//    }

    public SmsClientsDTO createSmsClient( SmsClientsDTO smsClientsDTO) {
        SmsClients smsClients = new SmsClients();
        BeanUtils.copyProperties(smsClientsDTO, smsClients);
        SmsClients savedClient = smsClientsRepository.save(smsClients);
        SmsClientsDTO savedDto = new SmsClientsDTO();
        BeanUtils.copyProperties(savedClient, savedDto);
        return savedDto;
    }

    public List<SmsClientsDTO> getAllSmsClients() {
        List<SmsClients> clients = smsClientsRepository.findAll();
        return clients.stream()
                .map(client -> {
                    SmsClientsDTO dto = new SmsClientsDTO();
                    BeanUtils.copyProperties(client, dto);
                    return dto;
                })
                .collect(Collectors.toList());
    }

    public SmsClientsDTO getSmsClientById(Integer clientId) {
        Optional<SmsClients> clientOptional = smsClientsRepository.findById(clientId);
        if (clientOptional.isPresent()) {
            SmsClientsDTO dto = new SmsClientsDTO();
            BeanUtils.copyProperties(clientOptional.get(), dto);
            return dto;
        }
        return null;
    }

    public SmsClientsDTO updateSmsClient(Integer clientId, SmsClientsDTO smsClientsDTO) {
        Optional<SmsClients> clientOptional = smsClientsRepository.findById(clientId);
        if (clientOptional.isPresent()) {
            SmsClients existingClient = clientOptional.get();
            smsClientsDTO.setClientId(clientId);
            BeanUtils.copyProperties(smsClientsDTO, existingClient);
            SmsClients updatedClient = smsClientsRepository.save(existingClient);
            SmsClientsDTO updatedDto = new SmsClientsDTO();
            BeanUtils.copyProperties(updatedClient, updatedDto);
            return updatedDto;
        }
        return null;
    }

    public boolean deleteSmsClient(Integer clientId) {
        if (smsClientsRepository.existsById(clientId)) {
            smsClientsRepository.deleteById(clientId);
            return true;
        }
        return false;
    }
}