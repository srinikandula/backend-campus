package com.anyaudit.service;

import com.anyaudit.BaseTest;
import com.anyaudit.models.Client;
import com.anyaudit.repository.ClientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintViolationException;


public class ClientManagerTest extends BaseTest {

    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ClientManager clientManager;


    @Test
    public void shouldSaveClient() {
        // given
        Client client = new Client();
        client.setName("Test Client");
        client.setPhoneNo("1234567890");
        client.setEmail("test@example.com");
        client.setFileNo("123456");

        // when
        Client m = clientManager.addClient(client);
        assertNotNull(m);

        // then
        assertNotNull(m.getId());
        assertEquals("Test Client", m.getName());
        assertEquals("1234567890", m.getPhoneNo());
        assertEquals("test@example.com", m.getEmail());
        assertEquals("123456", m.getFileNo());
    }

    @Test
    public void WhenNameIsBlank() {
        // given
        Client client = new Client();
        client.setName("");
        client.setPhoneNo("1234567890");
        client.setEmail("test@example.com");
        client.setFileNo("123456");

       // client.setFinancialFramework("Test Framework");

        // when, then
        assertThrows(ConstraintViolationException.class, () -> clientRepository.save(client));
    }

    @Test
    public void WhenPhoneNoIsBlank() {
        // given
        Client client = new Client();
        client.setName("Test Client");
        client.setPhoneNo("");
        client.setEmail("test@example.com");
        client.setFileNo("123456");
       // client.setFinancialFramework("Test Framework");

        // when, then
        assertThrows(ConstraintViolationException.class, () -> clientRepository.save(client));
    }

    @Test
    public void WhenEmailIsBlank() {
        // given
        Client client = new Client();
        client.setName("Test Client");
        client.setPhoneNo("1234567890");
        client.setEmail("");
        client.setFileNo("123456");
       // client.setFinancialFramework("Test Framework");

        // when, then
        assertThrows(ConstraintViolationException.class, () -> clientRepository.save(client));
    }

    @Test
    public void WhenFileNoIsBlank() {
        // given
        Client client = new Client();
        client.setName("Test Client");
        client.setPhoneNo("1234567890");
        client.setEmail("test@example.com");
        client.setFileNo("");
       // client.setFinancialFramework("Test Framework");

        // when, then
        assertThrows(ConstraintViolationException.class, () -> clientRepository.save(client));
    }




}
