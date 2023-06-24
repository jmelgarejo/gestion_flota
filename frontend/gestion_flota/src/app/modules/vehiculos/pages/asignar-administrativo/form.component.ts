import { Component, OnInit } from '@angular/core';
import { AsignarAdministrativo } from './asignar-administrativo';

@Component({
  selector: 'form',
  templateUrl: './form.component.html'

})
export class FormComponent implements OnInit {

  public asigadmin: AsignarAdministrativo = new AsignarAdministrativo()
  public titulo:string = "Asignar Administrativo"

  constructor() { }

  ngOnInit(): void {
  }
  public create():void{
    console.log("clicked!")
    console.log(this.asigadmin)
  }

}
