package com.anyaudit.controllers;

import com.anyaudit.models.AdditionalDisclosures;
import com.anyaudit.models.AssignmentTags;
import com.anyaudit.service.AdditionalDisclosuresManager;
import lombok.AllArgsConstructor;
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
@RequestMapping("/api/additionaldisclosures")
public class AdditionalDisclosuresController {
    @Autowired
    private AdditionalDisclosuresManager additionalDisclosuresManager;

    @GetMapping("/list")
    public ResponseEntity<List<AdditionalDisclosures>> getAll() {
        List<AdditionalDisclosures> plans = additionalDisclosuresManager.getAll();
        return ResponseEntity.ok(plans);
    }
}
