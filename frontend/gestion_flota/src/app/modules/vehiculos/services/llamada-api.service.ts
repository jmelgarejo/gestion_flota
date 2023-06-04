import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LlamadaApiService {

  constructor(private http: HttpClient) { }
  
  
  getData(): Observable<any> {
    try {
      const url = 'https://pokeapi.co/api/v2/pokemon/';
      const response = this.http.get(url);
      console.log("soy servicio response");
      console.log(response);
      return response
    } catch (error) {
      console.log(error);
      
    }
  }
}
