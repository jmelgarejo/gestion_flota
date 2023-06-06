import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LlamadaApiService {

  private baseUrl = 'https://pokeapi.co/api/v2/pokemon';
  //private baseUrl = 'http://167.99.24.209:8080/solicitud';

  constructor(private http: HttpClient) { }

  async getPokemon(offset = 20, limit = 20) {
    const result = await this.http.get<any>(`${this.baseUrl}/?offset=${offset}&limit=${limit}`).toPromise();
    //const result = await this.http.get<any>(`${this.baseUrl}`).toPromise();
    console.log("RESULTADO");
    console.log(result);
    
    return result.results
  }
}
