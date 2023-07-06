package com.example.servicodedelivery.envio;

import com.example.servicodedelivery.model.Produto;
import org.springframework.stereotype.Component;

@Component
public interface FormaDeEnvio {

    String enviar(Produto produto);

}
