import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from 'environments/environment';

const URL = environment.url;

@Injectable({
  providedIn: 'root'
})
export class SolicitarVehiculoService {

  constructor(private http: HttpClient) { }

  async getSolicitudes() {

    const baseUrl = URL+'/solicitud'

    const result = await this.http.get<any>(`${baseUrl}`).toPromise();

    console.log("SOLICITUDES");
    console.log(result);
    
    return result

  }

  async postSolicitudes(id: Number, clienteID: Number,planificacionID:Number,estado:string,origen:string,destino:string,fecha_solicitud:Date,fecha_entrega:Date) {
    const baseUrl = URL + '/solicitud';
  
    const body = { // Objeto que se enviará en la petición POST
      id_solicitud: id,
      cliente_id: clienteID,
      planificacion_id: planificacionID,
      estado: estado,
      origen: origen,
      destino: destino,
      fecha_solicitud:fecha_solicitud,
      fecha_entrega:fecha_entrega
    };
    
    console.log("BODY POST");
    console.log(body);
    
    try {
      const result = await this.http.post<any>(baseUrl, body).toPromise();
  
      return result;
    } catch (error) {
      console.error("Error registrando solicitud:", error);
    }
  }

  async putSolicitudes(id: string, clienteID: string,planificacionID:string,estado:string,origen:string,destino:string,fecha_solicitud:Date,fecha_entrega:Date) {

    const baseUrl = URL+`/solicitud`

    const body = { // Objeto que se enviará en la petición POST
      id_solicitud: id,
      cliente_id: clienteID,
      planificacion_id: planificacionID,
      estado: estado,
      origen: origen,
      destino: destino,
      fecha_solicitud:fecha_solicitud,
      fecha_entrega:fecha_entrega
    };
  
    try {
      const result = await this.http.put<any>(baseUrl, body).toPromise();

  
      return result;
    } catch (error) {
      console.error("Error registrando solicitud:", error);
    }

  }
}
