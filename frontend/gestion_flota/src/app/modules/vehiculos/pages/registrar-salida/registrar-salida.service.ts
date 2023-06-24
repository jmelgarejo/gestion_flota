import { Injectable } from '@angular/core';

import { RegistrarSalida } from './registrar-salida';
import { Observable, of } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class RegistrarSalidaService {
//private urlEndPoint:string = 'http://localhost:8080/api/registrarsalida'
private urlEndPoint:string ='http://167.99.24.209:8080/api/registrarsalida'
private httpHeaders = new HttpHeaders({'Content-Type' : 'application/json'})
  constructor(private http:HttpClient) { }

  getRegistrarSalidas(): Observable<RegistrarSalida[]>{
    //return of(REGSALIDAS)
    return this.http.get<RegistrarSalida[]>(this.urlEndPoint);
  }

  create(regSal: RegistrarSalida) : Observable<RegistrarSalida> {
      return this.http.post<RegistrarSalida>(this.urlEndPoint, regSal,{headers: this.httpHeaders})

  }
}
