import { Routes } from '@angular/router';

import { AdminLayoutComponent } from './layouts/admin/admin-layout.component';
import { AuthLayoutComponent } from './layouts/auth/auth-layout.component';



export const AppRoutes: Routes = [{
        path: '',
        redirectTo: 'dashboard',
        pathMatch: 'full',
      },{
        path: '',
        component: AdminLayoutComponent,
        children: [
        { 
            path: '',
            loadChildren: () => import('./dashboard/dashboard.module').then(x => x.DashboardModule)
         },
        {
            path: 'components',
            loadChildren: () => import('./components/components.module').then(x=>x.ComponentsModule)
        },{
            path: 'forms',
            loadChildren: () => import('./form/form.module').then(x=>x.FormModule)
        },{
            path: 'tables',
            loadChildren:() => import( './tables/tables.module').then(x=>x.TablesModule)
        },{
            path: 'charts',
            loadChildren:() => import( './charts/charts.module').then(x=>x.ChartsModule)
        },{
            path: 'calendar',
            loadChildren:() => import( './calendar/calendar.module').then(x=>x.CalendarModule)
        },{
            path: '',
            loadChildren:() => import( './userpage/user.module').then(x=>x.UserModule)
        },{
            path: '',
            loadChildren:() => import( './timeline/timeline.module').then(x=>x.TimelineModule)
        },{
            path: '',
            loadChildren:() => import( './widgets/widgets.module').then(x=>x.WidgetsModule)
        },
        {
          path: 'vehiculos',
          loadChildren: () => import('./modules/vehiculos/vehiculos.module').then(x => x.VehiculosModule),
        },
        {
          path: 'despachos',
          loadChildren: () => import('./modules/despachos/despachos.module').then(x => x.DespachosModule),
        },
        { path: 'asignar-administrativo/form', 
        loadChildren: () => import('./modules/vehiculos/pages/asignar-administrativo/form.component').then(x=>x.FormComponent),
        
      }]
        },{
            path: '',
            component: AuthLayoutComponent,
            children: [{
                path: 'pages',
                loadChildren:() => import( './pages/pages.module').then(x=>x.PagesModule)
            }]},
        
            
        
];
