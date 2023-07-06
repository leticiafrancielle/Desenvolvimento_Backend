package com.example.servicodedelivery.controller;

import com.example.servicodedelivery.model.Produto;
import com.example.servicodedelivery.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/envio")
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;

    @PostMapping
    public String enviarProduto(@RequestBody Produto produto){
        return deliveryService.enviar(produto);
    }

}
