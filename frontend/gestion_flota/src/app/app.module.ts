import { FormregsalComponent } from './modules/vehiculos/pages/registrar-salida/formregsal.component';



import { NgModule } from '@angular/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { RouterModule, Routes } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { AppComponent }   from './app.component';
import { SidebarModule } from './sidebar/sidebar.module';
import { FixedPluginModule } from './shared/fixedplugin/fixedplugin.module';
import { FooterModule } from './shared/footer/footer.module';
import { NavbarModule} from './shared/navbar/navbar.module';
import { AdminLayoutComponent } from './layouts/admin/admin-layout.component';
import { AuthLayoutComponent } from './layouts/auth/auth-layout.component';
import { AppRoutes } from './app.routing';
import { HttpClientModule } from '@angular/common/http';
import { AsignarAdministrativoService } from './modules/vehiculos/pages/asignar-administrativo/asignar-administrativo.service';
import { FormComponent } from './modules/vehiculos/pages/asignar-administrativo/form.component';
import { RegistrarSalidaService } from './modules/vehiculos/pages/registrar-salida/registrar-salida.service';



@NgModule({
   
    imports:[
        BrowserAnimationsModule,
        FormsModule,
        RouterModule.forRoot(AppRoutes,{
         useHash: true
        }),
       
        HttpClientModule,
        NgbModule,
        SidebarModule,
        NavbarModule,
        FooterModule,
        FixedPluginModule
    ],
    providers:[ AsignarAdministrativoService, RegistrarSalidaService],
    

    
    declarations: [
        AppComponent,
        AdminLayoutComponent,
        AuthLayoutComponent,
        FormComponent,
        FormregsalComponent,
    ],
    bootstrap:    [ AppComponent ]
})

export class AppModule { }
