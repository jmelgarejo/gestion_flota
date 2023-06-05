import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LlamadaApiService {

  private baseUrl = 'https://pokeapi.co/api/v2/pokemon';

  constructor(private http: HttpClient) { }

  async getPokemon(offset = 20, limit = 20) {
    const result = await this.http.get<any>(`${this.baseUrl}/?offset=${offset}&limit=${limit}`).toPromise();
    return result.results
  }
}
