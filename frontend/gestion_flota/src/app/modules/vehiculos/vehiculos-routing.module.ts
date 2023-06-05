import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SolicitarVehiculosComponent } from './pages/solicitar-vehiculos/solicitar-vehiculos.component';
import { RegistrarSalidaComponent } from './pages/registrar-salida/registrar-salida.component';
import { IngresarRetornoComponent } from './pages/ingresar-retorno/ingresar-retorno.component';
import { RegistrarIncidenteComponent } from './pages/registrar-incidente/registrar-incidente.component';
import { VehiculosDisponiblesComponent } from './pages/vehiculos-disponibles/vehiculos-disponibles.component';
import { AsignarAdministrativoComponent } from './pages/asignar-administrativo/asignar-administrativo.component';
import { ListadoPokemonComponent } from './pages/listado-pokemon/listado-pokemon.component';
const routes: Routes = [
  { path: 'solicitarVehiculo', component: SolicitarVehiculosComponent},
  { path: 'registrarSalida', component: RegistrarSalidaComponent},
  { path: 'ingresarRetorno', component: IngresarRetornoComponent},
  { path: 'registrarIncidente', component: RegistrarIncidenteComponent},
  { path: 'vehiculosDisponibles', component: VehiculosDisponiblesComponent},
  { path: 'asignarAdministrativo', component: AsignarAdministrativoComponent},
  { path: 'listadoPokemon', component: ListadoPokemonComponent},


];



@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class VehiculosRoutingModule { }
