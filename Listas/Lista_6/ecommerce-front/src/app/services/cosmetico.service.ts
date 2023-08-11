import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Cosmetico } from '../models/cosmetico';

@Injectable({
  providedIn: 'root'
})
export class CosmeticoService{
  private rota: string = "http://localhost:8080/cosmeticos"

  constructor(private httpClient : HttpClient) { }

  public getCosmeticos(): Observable<Cosmetico[]> {
    return this.httpClient.get<Cosmetico[]>(this.rota)
  }

  public postCosmetico(cosmetico: Cosmetico): Observable<Cosmetico>{
    return this.httpClient.post<Cosmetico>(this.rota, cosmetico)
  }
}