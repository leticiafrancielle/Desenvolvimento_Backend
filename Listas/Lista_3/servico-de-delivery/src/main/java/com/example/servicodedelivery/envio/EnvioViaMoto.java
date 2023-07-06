package com.example.servicodedelivery.envio;

import com.example.servicodedelivery.model.Produto;
import org.springframework.stereotype.Component;

@Component
public class EnvioViaMoto implements FormaDeEnvio{

    @Override
    public String enviar(Produto produto) {
        return "O produto: " + produto.getNome() + " foi enviado via Moto";
    }
}
