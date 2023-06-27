import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from 'environments/environment';

const URL = environment.url;

@Injectable({
  providedIn: 'root'
})
export class RegistrarSalidasService {
  
  
  constructor(private http: HttpClient) { }
  
  async getSalidas() {
    
    const baseUrl = URL+'/api/registrarsalida'
    const result = await this.http.get<any>(`${baseUrl}`).toPromise();

    console.log("Salidas");
    console.log(result);
    
    return result

  }

  async postSalidas(id: string, create_at: Date, estado: string, patente: string) {
    const baseUrl = URL + '/api/registrarsalida';
  
    const body = { // Objeto que se enviará en la petición POST
      id: id,
      create_at: create_at,
      estado: estado,
      patente: patente,
      salida: "si"
    };
  
    try {
      const result = await this.http.post<any>(baseUrl, body).toPromise();
  
      console.log("Salidas");
      console.log(result);
  
      return result;
    } catch (error) {
      console.error("Error registrando salida:", error);
    }
  }

  async putSalidas(id: string, create_at: string, estado: string, patente: string) {

    console.log("put FECHA");
    console.log(create_at);
    
    const baseUrl = URL+`/api/registrarsalida/${id}`

    const body = { // Objeto que se enviará en la petición PUT
      createAT: create_at,
      estado: estado,
      patente: patente,
      salida: "si"
    };
  
    try {
      const result = await this.http.put<any>(baseUrl, body).toPromise();
  
      console.log("Salidas");
      console.log(result);
  
      return result;
    } catch (error) {
      console.error("Error registrando salida:", error);
    }

  }

}
