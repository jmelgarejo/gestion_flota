import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from 'environments/environment';

const URL = environment.url;

@Injectable({
  providedIn: 'root'
})
export class VehiculosDisponiblesService {
  constructor(private http: HttpClient) { }

  async getVehiculos() {

    const baseUrl = URL+'/vehiculos'

    const result = await this.http.get<any>(`${baseUrl}`).toPromise();

    console.log("VEHICULOS");
    console.log(result);
    
    return result
  }

  async postVehiculos(id: string, patente: string, motor: string, revision: Date, marca: string, anio: Number,modelo:string,poliza:string,ingreso:Date) {
    const baseUrl = URL + '/vehiculo';
    
    console.log("POST SERVICE");
    
    const body = { // Objeto que se enviará en la petición POST
      id_vehiculo: id,
      patente: patente,
      numero_motor: motor,
      fecha_revision_tecnica: revision,
      marca: marca,
      anio: anio,
      modelo: modelo,
      poliza: poliza,
      fecha_ingreso: ingreso,
      fecha_poliza:ingreso
    };
    console.log(body);
    
    try {
      const result = await this.http.post<any>(baseUrl, body).toPromise();
  
      return result;
    } catch (error) {
      console.error("Error registrando Vehiculo:", error);
    }
  }

  async putVehiculos(id: string, patente: string, motor: string, revision: Date, marca: string, anio: Number,modelo:string,poliza:string,ingreso:Date) {

    const baseUrl = URL+`/vehiculo`

    const body = { // Objeto que se enviará en la petición POST
      id_vehiculo: id,
      patente: patente,
      numero_motor: motor,
      fecha_revision_tecnica: revision,
      marca: marca,
      anio: anio,
      modelo: modelo,
      poliza: poliza,
      fecha_ingreso: ingreso,
      fecha_poliza:ingreso
    };
  
    try {
      const result = await this.http.put<any>(baseUrl, body).toPromise();
  
      return result;
    } catch (error) {
      console.error("Error registrando Vehiculo:", error);
    }

  }

}
