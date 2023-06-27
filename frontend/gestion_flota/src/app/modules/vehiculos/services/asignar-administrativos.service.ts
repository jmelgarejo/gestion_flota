import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from 'environments/environment';

const URL = environment.url;

@Injectable({
  providedIn: 'root'
})
export class AsignarAdministrativosService {
  private baseUrl = URL+'/api/asignadmin'
  constructor(private http: HttpClient) { }

  async getAdministrativos(offset = 20, limit = 20) {
    const result = await this.http.get<any>(`${this.baseUrl}`).toPromise();

    console.log("ADMINISTRATIVOS");
    console.log(result);
    
    return result
  }
}
