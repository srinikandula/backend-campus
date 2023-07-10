package com.anyaudit.controllers;

import com.anyaudit.models.DisclosureGroups;
import com.anyaudit.models.ExpertAgencies;
import com.anyaudit.service.DisclosureGroupsManager;
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
@RequestMapping("/api/disclosuregroups")
public class DisclosureGroupsController {
    @Autowired
    private DisclosureGroupsManager disclosureGroupsManager;

    @GetMapping("/list")
    public ResponseEntity<List<DisclosureGroups>> getAll() {
        List<DisclosureGroups> plans = disclosureGroupsManager.getAll();
        return ResponseEntity.ok(plans);
    }
}
