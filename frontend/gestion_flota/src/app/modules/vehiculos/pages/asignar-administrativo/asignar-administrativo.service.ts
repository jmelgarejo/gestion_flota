import { Injectable } from '@angular/core';
import { AsignarAdministrativo } from './asignar-administrativo';
import { Observable, map, of } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';



@Injectable({
  providedIn: 'root'
})
export class AsignarAdministrativoService {
 // private urlEndPoint:string = "http://localhost:8080/api/asignadmin";
 private urlEndPoint:string ='http://167.99.24.209:8080/api/asignadmin'
  private httpHeaders = new HttpHeaders({'Content-Type': 'application/json'})

  constructor( private http: HttpClient) { }
  getAsignarAdministrativo():Observable<AsignarAdministrativo[]>{
    //return of(ASIGADMINS); 
    return this.http.get<AsignarAdministrativo[]>(this.urlEndPoint);
    
  }

  create(asigadmin: AsignarAdministrativo) : Observable<AsignarAdministrativo>{
    return this.http.post<AsignarAdministrativo>(this.urlEndPoint, asigadmin, {headers: this.httpHeaders})
  }
}
