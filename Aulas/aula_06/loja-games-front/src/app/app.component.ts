import { Component, OnInit } from '@angular/core';
import { Jogo } from './model/jogo';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'loja-games-front';

  jogos!: Jogo[];

 constructor(private httpClient: HttpClient){
  // this.jogos = [];
  // this.jogos.push(new Jogo (1, "Pokemon", "blá blá blá", 59.99, "https://www.gamespot.com/a/uploads/scale_medium/1197/11970954/3097443-pokemongo_box.jpg"))
  // this.jogos.push(new Jogo (2, "Slither.io", "blá blá blá", 39.99, "https://m.media-amazon.com/images/I/610-sk3DvyL.jpg"))
  // this.jogos.push(new Jogo (3, "Katana Zero", "blá blá blá", 79.99, "https://fs-prod-cdn.nintendo-europe.com/media/images/11_square_images/games_18/nintendo_switch_download_software/SQ_NSwitchDS_KatanaZero_image500w.jpg"))

  }
  ngOnInit(): void {
    this.getJogos();
  }

  getJogos(){
    this.httpClient.get<Jogo[]>("http://localhost:8080/jogos").subscribe(retorno => {
       this.jogos = retorno;
    })
  }
}
