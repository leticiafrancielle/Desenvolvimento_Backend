package com.programando.lojagamesback.repository;

import com.programando.lojagamesback.model.Jogo;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Component
public class BancoDeDados {
    private List<Jogo> jogos = new ArrayList<>();

    public BancoDeDados(){
        jogos.add(new Jogo(1, "Pokemon", "blá blá blá", 49.99, "https://www.gamespot.com/a/uploads/scale_medium/1197/11970954/3097443-pokemongo_box.jpg", false));
        jogos.add(new Jogo(2, "Slither.io", "blá blá blá", 59.99, "https://m.media-amazon.com/images/I/610-sk3DvyL.jpg", false));
        jogos.add(new Jogo(3, "Katana Zero", "blá blá blá", 79.99, "https://fs-prod-cdn.nintendo-europe.com/media/images/11_square_images/games_18/nintendo_switch_download_software/SQ_NSwitchDS_KatanaZero_image500w.jpg", false));
    }

    public List<Jogo> findAll(){
        return jogos;
    }
}

