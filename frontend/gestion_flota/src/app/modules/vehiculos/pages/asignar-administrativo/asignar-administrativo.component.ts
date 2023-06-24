import { Component, OnInit } from '@angular/core';
import { AsignarAdministrativo } from './asignar-administrativo';
import { AsignarAdministrativoService } from './asignar-administrativo.service';


@Component({
  selector: 'app-asignar-administrativo',
  templateUrl: './asignar-administrativo.component.html'
 
})
export class AsignarAdministrativoComponent implements OnInit {
 /* public dataTable: DataTable;*/
  asigAdmin: AsignarAdministrativo[];
  constructor(private asignarAdministrativoService:AsignarAdministrativoService ) { }

  ngOnInit(){
    this.asignarAdministrativoService.getAsignarAdministrativo().subscribe(
      asignarAdmin=> this.asigAdmin=asignarAdmin
    );

     
 
 }
}
