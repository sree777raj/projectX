package com.prakat.projectx.controller;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class UserControllerTest {

    @Autowired
    private UserController userController;

    @Test
    public void testHelloWorld() {
        String result = userController.helloWorld();
        assertEquals("Hello world", result);
    }
}
