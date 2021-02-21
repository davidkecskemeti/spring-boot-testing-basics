package com.dk.testing.jpatesting.controllers;

import com.dk.testing.jpatesting.repositories.UserRepository;
import com.dk.testing.jpatesting.services.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@TestPropertySource(locations = "classpath:application-test.properties")
class UserControllerIntegrationTest2 {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private UserRepository userRepository;

    @InjectMocks // auto inject helloRepository
    private UserService userService;

    @BeforeEach
    void setMockOutput() {
        when(userRepository.findAll()).thenReturn(Collections.emptyList());
    }

    @DisplayName("Test Mock helloService + helloRepository")
    @Test
    void testGet() {
        assertEquals(0, userService.findAll().size());
    }

}