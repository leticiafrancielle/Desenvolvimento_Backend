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
        cosmeticos.add(new Cosmetico(1, "Shampoo", 29.59, "https://res.cloudinary.com/beleza-na-web/image/upload/w_1500,f_auto,fl_progressive,q_auto:eco,w_800/v1/imagens/product/MP41126/7f2501a1-29ad-4ce5-8d6d-a15f0aef3483-soul-power-big-wash-bomb-shampoo-315ml.png"));
        cosmeticos.add(new Cosmetico(2, "Condicionador", 21.54, "https://res.cloudinary.com/beleza-na-web/image/upload/w_1500,f_auto,fl_progressive,q_auto:eco,w_800/v1/imagens/product/MP79007/3da4e22e-ab5f-492c-81f7-0c435411fca5-628c03d81545664eef43f5f0-1077480632719764881.jpg"));
        cosmeticos.add(new Cosmetico(3, "Mascára de Hidratação", 43.99, "https://encrypted-tbn0.gstatic.com/shopping?q=tbn:ANd9GcTR5ChADMUWlqJq1neHqDE7BEXRfIR94ivowo9KXt41aq44147yNVFCh-jMUwgzhq1uxgNHYMcn_IrH94WcNp0agma6nzx_XmcyzC3mGi3FapyaJ0lwTyQLlg&usqp=CAE"));
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
