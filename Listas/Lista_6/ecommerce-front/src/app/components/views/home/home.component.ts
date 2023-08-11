import { Component, OnInit } from '@angular/core';
import { Cosmetico } from 'src/app/models/cosmetico';
import { CosmeticoService } from 'src/app/services/cosmetico.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  cosmeticos: Cosmetico[] = []

  constructor(private CosmeticoService: CosmeticoService) { }

  ngOnInit(): void {
    this.fillCosmeticos()
  }
  fillCosmeticos(){
    this.CosmeticoService.getCosmeticos().subscribe(resposta => {
      this.cosmeticos = resposta
    })
  }
}
