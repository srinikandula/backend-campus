package com.anyaudit.service;

import com.anyaudit.models.DisclosureGroups;

import com.anyaudit.repository.DisclosureGroupsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisclosureGroupsManager {
    @Autowired
    private DisclosureGroupsRepository disclosureGroupsRepository;

    public List<DisclosureGroups> getAll() {
        return disclosureGroupsRepository.findAll();
    }
}
