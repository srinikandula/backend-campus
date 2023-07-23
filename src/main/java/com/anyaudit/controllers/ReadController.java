package com.anyaudit.controllers;

import com.anyaudit.service.ReadManager;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@Getter
@Setter
@RequestMapping("/api/read")
public class ReadController {
    @Autowired
    private ReadManager readManager;

    @GetMapping("/count")
    public ResponseEntity<Long> getClientCount() {
        Long count = readManager.getClientCount();
        return ResponseEntity.ok(count);
    }
}
