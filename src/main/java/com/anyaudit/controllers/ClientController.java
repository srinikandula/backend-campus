package com.anyaudit.controllers;

import com.anyaudit.models.Client;
import com.anyaudit.payload.response.MessageResponse;
import com.anyaudit.repository.ClientRepository;
import com.anyaudit.service.ClientManager;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/client")
public class ClientController {

    @Autowired
    private ClientManager clientService;

    @GetMapping("/list")
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> getClientById(@PathVariable("id") long clientId) {
        Client client = clientService.getClientById(clientId);
        if (client == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(client);
    }

    @PostMapping("/save")
    public ResponseEntity<?> addClient(@RequestBody Client client) {
        Map<String, String> errors = validateClient(client);
        if (!errors.isEmpty()) {
            return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
        } else {
            Client savedClient = clientService.addClient(client);
            return new ResponseEntity<>(savedClient, HttpStatus.CREATED);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Client> updateClient(@PathVariable("id") long clientId, @RequestBody Client client) {
        if (client.getId() != clientId) {
            return ResponseEntity.badRequest().build();
        }
        Client saved = clientService.updateClient(client);
        if (saved == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(saved);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClient(@PathVariable("id") long clientId) {
        clientService.deleteClient(clientId);
        return ResponseEntity.noContent().build();
    }

//    @GetMapping("/names")
//    public List<Object[]> findNameAndId() {
//        return clientService.findNameAndId();
//    }
//    @GetMapping("/names")
//    public List<Map<String, Object>> findNameAndId() {
//        List<Client> clients = clientService.findNameAndId();
//        List<Map<String, Object>> resultList = new ArrayList<>();
//        for ( Client : clients) {
//            Map<String, Object> clientMap = new HashMap<>();
//            clientMap.put("client_id", client[0]);
//            clientMap.put("name", client[1]);
//            resultList.add(clientMap);
//        }
//        return resultList;
//
//    }


    private Map<String, String> validateClient(Client client) {
        Map<String, String> errors = new HashMap<>();

        if (client.getEmail() == null || client.getEmail().isEmpty()) {
            errors.put("email", "Client email can not be null");
        }
        if (client.getName().length() < 6) {
            errors.put("name", "Client name should be a minimum of 6 characters");
        }

        String phone = client.getPhoneNo();
        if (!phone.matches("\\d+")) {
            errors.put("phone", "Phone should only contain numerical digits");
        } else if (phone.length() > 15) {
            errors.put("phone", "Phone can take up to 15 characters");
        }

        String file = client.getFileNo();
        if (!file.matches("^[a-zA-Z0-9]+$")) {
            errors.put("fileNo", "File number should only contain letters and numerical digits");
        } else if (file.length() > 10) {
            errors.put("fileNo", "File number can take up to 10 characters");
        }

        return errors;
    }
}
