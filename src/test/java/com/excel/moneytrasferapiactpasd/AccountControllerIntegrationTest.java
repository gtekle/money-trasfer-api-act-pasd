package com.excel.moneytrasferapiactpasd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureTestDatabase
public class AccountControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldCreateAccountGivenCorrectInput(){

        mockMvc.perform(
                post("/api/account/create")
                .accept("application/json")
                .content("{\n" +
                "    \"firstName\": \"Tekle\",\n" +
                "    \"lastName\": \"Kidanemariam\",\n" +
                "    \"email\": \"teklegy@gmail.com\",\n" +
                "    \"phoneNumber\": \"+251-911-517169\",\n" +
                "    \"pin\": \"1234\"\n" +
                "}"))
                .andDo(print())
                .andExpect(content().json("{\n" +
                        "    \"id\": 2,\n" +
                        "    \"firstName\": \"Tekle\",\n" +
                        "    \"lastName\": \"Kidanemariam\",\n" +
                        "    \"email\": \"teklegy@gmail.com\",\n" +
                        "    \"phoneNumber\": \"+251-911-517169\",\n" +
                        "    \"pin\": 1234,\n" +
                        "    \"isVerified\": true,\n" +
                        "    \"balance\": 0.0\n" +
                        "}"
                ));

    }
}
