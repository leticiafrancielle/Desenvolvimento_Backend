package com.programando.ecommerce.repository;

import com.programando.ecommerce.model.Cosmetico;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class BancoDeDados {

    List<Cosmetico> cosmeticos = new ArrayList<>();

    public BancoDeDados(){
        cosmeticos.add(new Cosmetico(1, "Shampoo", new BigDecimal(59.90).setScale(2, BigDecimal.ROUND_HALF_UP)));
        cosmeticos.add(new Cosmetico(2, "Condicionador", new BigDecimal(149.99).setScale(2, BigDecimal.ROUND_HALF_UP)));
        cosmeticos.add(new Cosmetico(3, "Hidratante Corporal", new BigDecimal(49.99).setScale(2, BigDecimal.ROUND_HALF_UP)));
    }

    public List<Cosmetico> findAll(){
        return cosmeticos;
    }
    public String save(Cosmetico cosmetico) {
        for (Cosmetico cosmeticoAtual : cosmeticos) {
            if (cosmeticoAtual.getId() == cosmetico.getId()){
                return "Impossível cadastrar cosmetico!";
            }
        }
        cosmeticos.add(cosmetico);
        return "O cosmetico " + cosmetico.getNome() + " foi cadastrado com sucesso!";

    }
    public String delete(int id){
        for (Cosmetico cosmetico : cosmeticos){
            if(cosmetico.getId() == id){
                String message = "O cosmetico " + cosmetico.getNome() + " foi removido com sucesso!";
                cosmeticos.remove(cosmetico);
                return message;
            }
        }
        return "Esse cosmetico não existe!! ";
    }
}
