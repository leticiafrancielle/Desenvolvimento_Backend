import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';
import { Jogo } from '../models/jogo';

@Injectable({
  providedIn: 'root'
})
export class JogoService {
  private rota: string = "http://localhost:8080/jogos/"

  private jogoASerEXcluidoSubject = new BehaviorSubject<any>(null);
  jogoASerExcluido$ = this.jogoASerEXcluidoSubject.asObservable();

  constructor(private httpClient : HttpClient) { }
  
  setJogoASerExcluido(jogo: any ){
    this.jogoASerEXcluidoSubject.next(jogo);
  }

  deletarJogo(id: number){
    this.httpClient.delete(this.rota + id).subscribe();
    window.location.reload();
  }

  public getJogos(): Observable<Jogo[]> {
    return this.httpClient.get<Jogo[]>(this.rota)
  }

  public postJogo(jogo: Jogo): Observable<Jogo>{
    return this.httpClient.post<Jogo>(this.rota, jogo)
  }

  public favoritarJogo(id: number): Observable<Jogo>{
    return this.httpClient.put<Jogo>(this.rota + "/favoritar/" + id, null)
  }


}
