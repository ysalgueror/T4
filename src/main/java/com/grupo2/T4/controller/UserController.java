package com.grupo2.T4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class UserController {
    private final EmailController Zeus;

    @Autowired
    public UserController(EmailController Z){
        this.Zeus = Z;
   }
   public boolean MakeSend(String Destinatario){
   boolean SeEnvioCorreo=Zeus.SendEmail(Destinatario);
   return SeEnvioCorreo;
   }
}
