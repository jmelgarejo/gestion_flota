import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';

import { VehiculosRoutingModule } from './vehiculos-routing.module';
import { SolicitarVehiculosComponent } from './pages/solicitar-vehiculos/solicitar-vehiculos.component';
import { RegistrarSalidaComponent } from './pages/registrar-salida/registrar-salida.component';
import { IngresarRetornoComponent } from './pages/ingresar-retorno/ingresar-retorno.component';
import { RegistrarIncidenteComponent } from './pages/registrar-incidente/registrar-incidente.component';
import { VehiculosDisponiblesComponent } from './pages/vehiculos-disponibles/vehiculos-disponibles.component';
import { AsignarAdministrativoComponent } from './pages/asignar-administrativo/asignar-administrativo.component';
import { ListadoPokemonComponent } from './pages/listado-pokemon/listado-pokemon.component';

@NgModule({
  declarations: [
    SolicitarVehiculosComponent,
    RegistrarSalidaComponent,
    IngresarRetornoComponent,
    RegistrarIncidenteComponent,
    VehiculosDisponiblesComponent,
    AsignarAdministrativoComponent,
    ListadoPokemonComponent
  ],
  imports: [
    CommonModule,
    VehiculosRoutingModule,
    HttpClientModule
  ]
})
export class VehiculosModule { }
