import { Component, OnInit } from '@angular/core';
import { Cosmetico } from 'src/app/models/cosmetico';
import { CosmeticoService } from 'src/app/services/cosmetico.service';

@Component({
  selector: 'app-cadastro',
  templateUrl: './cadastro.component.html',
  styleUrls: ['./cadastro.component.css']
})
export class CadastroComponent implements OnInit{
  
  public cosmetico: Cosmetico = new Cosmetico()

  constructor(private cosmeticoService: CosmeticoService) { }

  ngOnInit(): void {
    
  }

  saveCosmetico(){
    this.cosmeticoService.postCosmetico(this.cosmetico).subscribe(resposta => {
      alert("O cosmético " + this.cosmetico.nome + " foi cadastrado com sucesso!")
    })
  }

}
