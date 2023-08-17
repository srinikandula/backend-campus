package com.anyaudit.controller;

import com.anyaudit.BaseControllerTest;
import com.anyaudit.models.Client;
import com.anyaudit.models.Framework;
import com.anyaudit.repository.ClientRepository;
import com.anyaudit.repository.FrameworkRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import org.json.simple.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ClientControllerTest extends BaseControllerTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private FrameworkRepository frameworkRepository;

    final ObjectMapper mapper = new ObjectMapper();

    @Autowired
    @Getter
    private ObjectMapper objectMapper;

    @Before
    public void setup() {
        super.setup();
    }

    @Test
    public void testAddClientAPI() throws Exception {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name","ClientX");
        jsonObject.put("phoneNo","9988667744");
        jsonObject.put("email","testClient123@gmail.com");
        jsonObject.put("fileNo","234");

        final String jsonContent = objectMapper.writeValueAsString(jsonObject);
        ResultActions resultActions = mvc.perform(MockMvcRequestBuilders.post("/api/client/save")
                .contentType(APPLICATION_JSON_UTF8).content(jsonContent)
                .header("Authorization", getToken()));
        resultActions.andExpect(status().isCreated());
        resultActions.andExpect(jsonPath("$.name").value(jsonObject.get("name")));

        //Testing without token
        resultActions = mvc.perform(MockMvcRequestBuilders.post("/api/client/save")
                .contentType(APPLICATION_JSON_UTF8).content(jsonContent)
                .header("Authorization", ""));
        resultActions.andExpect(status().isUnauthorized());
    }

    @Test
    public void testGetClientById() throws Exception {
        Framework framework = new Framework();
        framework.setFinancialFramework("TestClientFramework");
        framework = frameworkRepository.save(framework);
        Client client = new Client(Long.valueOf(4),"TestClient","9988667744","testClient123@gmail.com","234",framework);
        client = clientRepository.save(client);
        String token = getToken();

        String uri = "/api/client/"+client.getId();
        ResultActions resultActions = mvc.perform(MockMvcRequestBuilders.get(uri)
                .header("Authorization", token));
        resultActions.andExpect(status().isOk());
        resultActions.andExpect(jsonPath("$.name").value("TestClient"));
        resultActions.andExpect(jsonPath("$.phoneNo").value(client.getPhoneNo()));
    }


    @Test
    public void testGetClientsAPI(){

    }

}
