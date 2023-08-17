package com.anyaudit.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.anyaudit.dto.SmsClientsDTO;
import com.anyaudit.models.SmsClients;
import com.anyaudit.repository.SmsClientsRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class SmsClientsManagerTest {
    private SmsClientsRepository repository;
    @Autowired
    private SmsClientsManager smsClientsManager;

    @BeforeEach
    void setUp() {
    }



}
