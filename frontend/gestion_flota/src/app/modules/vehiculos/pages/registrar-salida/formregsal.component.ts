import { Component, OnInit } from '@angular/core';
import { RegistrarSalida } from './registrar-salida';


@Component({
  selector: 'formregsal',
  templateUrl: './formregsal.component.html'
 
})
export class FormregsalComponent implements OnInit {

  public regsalidas: RegistrarSalida = new RegistrarSalida()
  public titulo:string = "Registrar Salida"

  constructor() { }

  ngOnInit(): void {
  }
  public create():void{
    console.log("clicked!")
    console.log(this.regsalidas)

  }
}
