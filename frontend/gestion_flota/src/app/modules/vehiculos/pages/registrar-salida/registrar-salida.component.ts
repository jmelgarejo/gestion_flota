import { Component, OnInit } from '@angular/core';
import { RegistrarSalida } from './registrar-salida';
import { RegistrarSalidaService } from './registrar-salida.service';




@Component({
  selector: 'app-registrar-salida',
  templateUrl: './registrar-salida.component.html'

})
export class RegistrarSalidaComponent implements OnInit {

  regsal: RegistrarSalida[]
 
  constructor(private regSalidasService: RegistrarSalidaService){}

  ngOnInit(){
    this.regSalidasService.getRegistrarSalidas().subscribe(
      regSal => this.regsal= regSal
    );
  }
}

