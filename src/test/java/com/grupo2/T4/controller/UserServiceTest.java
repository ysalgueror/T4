package com.grupo2.T4.controller;

import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.booleanThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class UserServiceTest {
    @Mock
    private EmailController EmailMock;
    private UserController User;

    @BeforeEach
    void SetUp(){
        MockitoAnnotations.openMocks(this);
        User=new UserController(EmailMock);
    }
    @Test
    void testEnviarCorreo(){
        when(EmailMock.SendEmail("daniboot@gmail.com")).thenReturn(true);
        boolean resultado = User.MakeSend("daniboot@gmail.com");
        verify(EmailMock).SendEmail("daniboot@gmail.com");
        assertTrue(resultado);
    }
}
