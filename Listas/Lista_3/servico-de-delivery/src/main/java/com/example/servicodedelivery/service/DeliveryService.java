package com.example.servicodedelivery.service;

import com.example.servicodedelivery.envio.FormaDeEnvio;
import com.example.servicodedelivery.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DeliveryService {

    @Autowired
    @Qualifier("envioViaMoto")
    private FormaDeEnvio formaDeEnvio;

    public String enviar(Produto produto){
        return formaDeEnvio.enviar(produto);
    }

}
