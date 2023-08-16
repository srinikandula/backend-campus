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

    @Test
    void createSmsClient() {
        SmsClientsDTO inputDto = createSampleSmsClientsDTO();
        SmsClients savedClient = createSampleSmsClients();

        when(repository.save(any(SmsClients.class))).thenReturn(savedClient);

        SmsClientsDTO resultDto = smsClientsManager.createSmsClient(inputDto);

        assertNotNull(resultDto);
        assertEquals(savedClient.getClientId(), resultDto.getClientId());
    }

    @Test
    void getAllSmsClients() {
        SmsClients client1 = createSampleSmsClients();
        SmsClients client2 = createSampleSmsClients();
        List<SmsClients> clients = Arrays.asList(client1, client2);

        when(repository.findAll()).thenReturn(clients);

        List<SmsClientsDTO> resultDtoList = smsClientsManager.getAllSmsClients();

        assertEquals(2, resultDtoList.size());
        assertEquals(client1.getClientId(), resultDtoList.get(0).getClientId());
        assertEquals(client2.getClientId(), resultDtoList.get(1).getClientId());
    }

    @Test
    void getSmsClientById() {
        SmsClients client = createSampleSmsClients();
        int clientId = client.getClientId();

        when(repository.findById(clientId)).thenReturn(Optional.of(client));

        SmsClientsDTO resultDto = smsClientsManager.getSmsClientById(clientId);

        assertNotNull(resultDto);
        assertEquals(clientId, resultDto.getClientId());
    }

    @Test
    void updateSmsClient() {
        SmsClients client = createSampleSmsClients();
        int clientId = client.getClientId();
        SmsClientsDTO updatedDto = createSampleSmsClientsDTO();

        when(repository.findById(clientId)).thenReturn(Optional.of(client));
        when(repository.save(any(SmsClients.class))).thenReturn(client);

        SmsClientsDTO resultDto = smsClientsManager.updateSmsClient(clientId, updatedDto);

        assertNotNull(resultDto);
        assertEquals(updatedDto.getClientName(), resultDto.getClientName());
    }

    @Test
    void deleteSmsClient() {
        int clientId = 1;

        when(repository.existsById(clientId)).thenReturn(true);

        boolean deleted = smsClientsManager.deleteSmsClient(clientId);

        assertTrue(deleted);
        verify(repository, times(1)).deleteById(clientId);
    }

    // Helper methods to create sample objects for testing

    private SmsClientsDTO createSampleSmsClientsDTO() {
        SmsClientsDTO dto = new SmsClientsDTO();
        dto.setClientName("Sample Client");
        dto.setFileNo("123456");
        dto.setClientEmail("sample@example.com");
        dto.setClientPan("ABCDE1234F");
        dto.setPhone("123-456-7890");
        dto.setOwnerName("John Doe");
        dto.setOwnerNum(10L);
        dto.setAccountantName("Jane Smith");
        dto.setAccountantNum(1234567890L);
        dto.setAddress("123 Main St, City");
        dto.setAsgClientId(5);
        dto.setStatus("Active");
        dto.setClientCreationDt(new Date()); // Set the client creation date appropriately
        dto.setDomainId(3);
        dto.setCoaHeadId(2);
        dto.setCosHeadId(-1);
        dto.setFssHeadId("1111");
        dto.setBranchId(7);
        dto.setMainOrSub((byte) 1);
        dto.setAssignmentId(3);
        dto.setCompanyId(2);
        dto.setNationality("Country");
        dto.setWebsite("https://example.com");
        dto.setContactPerson("Alice Johnson");
        dto.setAccountingPackage("QuickBooks");
        dto.setRegisteredAddress("456 Secondary St, Town");
        dto.setCin("CIN123456");
        dto.setRegistrationNo("Reg456");
        dto.setIec("IEC789");
        dto.setPfRegNo("PF123");
        dto.setEsiRegNo("ESI456");
        dto.setPtRegNo("PT789");
        dto.setIsFssUpdated(true);
        dto.setIsRepeated(2);
        dto.setIsCloned(true);
        return dto;
    }


    private SmsClients createSampleSmsClients() {
        SmsClients client = new SmsClients();
        client.setClientId(1); // Set a valid clientId here
        client.setClientName("Sample Client");
        client.setFileNo("123456");
        client.setClientEmail("sample@example.com");
        client.setClientPan("ABCDE1234F");
        client.setPhone("123-456-7890");
        client.setOwnerName("John Doe");
        client.setOwnerNum(10L);
        client.setAccountantName("Jane Smith");
        client.setAccountantNum(1234567890L);
        client.setAddress("123 Main St, City");
        client.setAsgClientId(5);
        client.setStatus("Active");
        client.setClientCreationDt(new Date()); // Set the client creation date appropriately
        client.setDomainId(3);
        client.setCoaHeadId(-1);
        client.setCosHeadId(4);
        client.setFssHeadId(1);
        client.setBranchId(7);
        client.setMainOrSub((byte) 1);
        client.setAssignmentId(3);
        client.setCompanyId(22222222);
        client.setNationality("Country");
        client.setWebsite("https://example.com");
        client.setContactPerson("Alice Johnson");
        client.setAccountingPackage("QuickBooks");
        client.setRegisteredAddress("456 Secondary St, Town");
        client.setCin("CIN123456");
        client.setRegistrationNo("Reg456");
        client.setIec("IEC789");
        client.setPfRegNo("PF123");
        client.setEsiRegNo("ESI456");
        client.setPtRegNo("PT789");
        client.setIsFssUpdated(true);
        client.setIsRepeated(2);
        client.setIsCloned(true);
        return client;
    }


}
