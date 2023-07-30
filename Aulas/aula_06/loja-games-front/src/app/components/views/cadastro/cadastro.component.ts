import { Component, OnInit } from '@angular/core';
import { Jogo } from 'src/app/models/jogo';
import { JogoService } from 'src/app/services/jogo.service';

@Component({
  selector: 'app-cadastro',
  templateUrl: './cadastro.component.html',
  styleUrls: ['./cadastro.component.css']
})
export class CadastroComponent implements OnInit{

  public jogo: Jogo = new Jogo()

  constructor(private jogoService: JogoService) { }

  ngOnInit(): void {
    
  }

  saveJogo(){
    this.jogoService.postJogo(this.jogo).subscribe(resposta => {
      alert("O jogo " + this.jogo.nome + "foi cadastrado com sucesso!")
    })
  }
}
