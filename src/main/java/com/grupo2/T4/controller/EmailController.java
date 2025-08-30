package com.grupo2.T4.controller;

import org.springframework.stereotype.Service;

@Service
public class EmailController{
    public boolean SendEmail(String Destinatario){
        System.out.println("Enviando correo " + Destinatario);
        return true;
    }

}

