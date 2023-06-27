import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule } from '@angular/forms';

import { VehiculosRoutingModule } from './vehiculos-routing.module';
import { SolicitarVehiculosComponent } from './pages/solicitar-vehiculos/solicitar-vehiculos.component';
import { IngresarRetornoComponent } from './pages/ingresar-retorno/ingresar-retorno.component';
import { RegistrarIncidenteComponent } from './pages/registrar-incidente/registrar-incidente.component';
import { VehiculosDisponiblesComponent } from './pages/vehiculos-disponibles/vehiculos-disponibles.component';
import { AsignarAdministrativoComponent } from './pages/asignar-administrativo/asignar-administrativo.component';
import { RegistrarSalidasComponent } from './pages/registrar-salidas/registrar-salidas.component';





@NgModule({
  declarations: [
    SolicitarVehiculosComponent,
    IngresarRetornoComponent,
    RegistrarIncidenteComponent,
    VehiculosDisponiblesComponent,
    AsignarAdministrativoComponent,
    RegistrarSalidasComponent,
   
   
   
  ],
  imports: [
    CommonModule,
    VehiculosRoutingModule,
    HttpClientModule,
    ReactiveFormsModule
  ]
})
export class VehiculosModule { }
