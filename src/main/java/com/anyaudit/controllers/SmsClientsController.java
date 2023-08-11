package com.anyaudit.controllers;

import com.anyaudit.models.SmsClients;
import com.anyaudit.service.SmsClientsManager;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@Getter
@Setter
@RequestMapping("/api/smsclient")
public class SmsClientsController {

    @Autowired
    private SmsClientsManager smsClientsManager;

    @GetMapping("/list")
    public ResponseEntity<List<SmsClients>> getAllSmsClients() {
        List<SmsClients> plans = smsClientsManager.getAllSmsClients();
        return ResponseEntity.ok(plans);
    }
}
