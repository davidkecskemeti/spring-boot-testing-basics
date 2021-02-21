package com.dk.testing.jpatesting.controllers;

import com.dk.testing.jpatesting.SpringBootJpaTestingApplication;
import com.dk.testing.jpatesting.repositories.UserRepository;
import com.dk.testing.jpatesting.services.UserService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Collections;

@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        classes = SpringBootJpaTestingApplication.class)
@AutoConfigureMockMvc
@TestPropertySource(locations = "classpath:application-test.properties")
class UserControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @DisplayName("Test Spring getUsers called with empty list")
    @Test
    void getUsers() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .get("/users")
                .accept(MediaType.APPLICATION_JSON);

        MvcResult mvcResult=mockMvc.perform(requestBuilder).andReturn();

        System.out.println(mvcResult.getResponse().getContentAsString());
    }
}