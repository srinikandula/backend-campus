package com.anyaudit.service;

import com.anyaudit.db2.repository.MonthRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReadManager {
    @Autowired
    private MonthRepository readRepository;

    public Long getClientCount() {
        return readRepository.getClientCount();
    }
}
