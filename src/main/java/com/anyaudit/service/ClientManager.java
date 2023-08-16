package com.anyaudit.service;

import com.anyaudit.models.Client;
import com.anyaudit.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientManager {
    @Autowired
    private ClientRepository clientRepository;


    public Client addClient(Client client) {
        if(client.getName().length() < 6) {
            throw new RuntimeException("Client name should be minimum of 6 characters");
        }
        Client savedClient = clientRepository.save(client);
        return savedClient;
    }


    public List<Client> getAllClients() {
        List<Client> assignments = clientRepository.findAll();
        return assignments;
    }

    public Client getClientById(long clientId) {
        Client c = clientRepository.findById(clientId).orElse(null);
        return c;
    }


    public Client updateClient(Client client) {
        Client c = clientRepository.findById(client.getId()).orElse(null);
        if (c == null) {
            return null;
        }
        c.setName(client.getName());
        c.setPhoneNo(client.getPhoneNo());
        c.setEmail(client.getEmail());
        c.setFileNo(client.getFileNo());
        c.setFramework(client.getFramework());
        Client savedClient = clientRepository.save(c);
        return savedClient;
    }


    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }


    public List<Client> findNameAndId() {
        return clientRepository.findNameAndId();
    }
}
