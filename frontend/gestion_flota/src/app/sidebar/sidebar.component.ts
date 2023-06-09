import { Component, OnInit, AfterViewInit, AfterViewChecked, AfterContentInit } from '@angular/core';

//Metadata
export interface RouteInfo {
    path: string;
    title: string;
    type: string;
    collapse?: string;
    icontype: string;
    // icon: string;
    children?: ChildrenItems[];
}

export interface ChildrenItems {
    path: string;
    title: string;
    ab: string;
    type?: string;
}

//Menu Items
export const ROUTES: RouteInfo[] = [{
    path: '/vehiculos',
    title: 'Vehiculos',
    type: 'sub',
    collapse: 'vehiculos',
    icontype: 'nc-icon nc-delivery-fast',
    children: [
        {path: 'ingresarRetorno', title: 'Ingresar Retorno', ab:'IR'},
        {path: 'solicitarVehiculo', title: 'Solicitar Vehiculo', ab:'SV'},
        {path: 'registrarSalida', title: 'Registrar Salida', ab:'RS'},
        {path: 'vehiculosDisponibles', title: 'Vehiculos Disponibles', ab:'VD'}    ]
},{
    path: '/despachos',
    title: 'Despachos',
    type: 'sub',
    collapse: 'despachos',
    icontype: 'nc-icon nc-paper',
    children: [
        {path: 'consultaPedidos', title: 'Consulta Pedidos', ab:'CP'},
        {path: 'planificarPedido', title: 'Planificar Pedido', ab:'PP'}
    ]
}
];


/* export const ROUTES: RouteInfo[] = [{
        path: '/dashboard',
        title: 'Dashboard',
        type: 'link',
        icontype: 'nc-icon nc-bank'
    },{
        path: '/vehiculos',
        title: 'Vehiculos',
        type: 'sub',
        collapse: 'vehiculos',
        icontype: 'nc-icon nc-delivery-fast',
        children: [
            {path: 'ingresarRetorno', title: 'Ingresar Retorno', ab:'IR'},
            {path: 'solicitarVehiculo', title: 'Solicitar Vehiculo', ab:'SV'},
            {path: 'registrarSalida', title: 'Registrar Salida', ab:'RS'},
            {path: 'vehiculosDisponibles', title: 'Vehiculos Disponibles', ab:'VD'},
            {path: 'asignarAdministrativo', title: 'Asignar Administrativo', ab:'AA'},
            {path: 'listadoPokemon', title: 'Listado POKEMONS', ab:'LP'}
        ]
    },{
        path: '/despachos',
        title: 'Despachos',
        type: 'sub',
        collapse: 'despachos',
        icontype: 'nc-icon nc-paper',
        children: [
            {path: 'consultaPedidos', title: 'Consulta Pedidos', ab:'CP'},
            {path: 'planificarPedido', title: 'Planificar Pedido', ab:'PP'}
        ]
    } ,{
        path: '/forms',
        title: 'Forms',
        type: 'sub',
        collapse: 'forms',
        icontype: 'nc-icon nc-ruler-pencil',
        children: [
            {path: 'regular', title: 'Regular Forms', ab:'RF'},
            {path: 'extended', title: 'Extended Forms', ab:'EF'},
            {path: 'validation', title: 'Validation Forms', ab:'VF'},
            {path: 'wizard', title: 'Wizard', ab:'W'}
        ]
    },{
        path: '/tables',
        title: 'Tables',
        type: 'sub',
        collapse: 'tables',
        icontype: 'nc-icon nc-single-copy-04',
        children: [
            {path: 'regular', title: 'Regular Tables', ab:'RT'},
            {path: 'extended', title: 'Extended Tables', ab:'ET'},
            {path: 'datatables.net', title: 'Datatables.net', ab:'DT'}
        ]
    },{
        path: '/maps',
        title: 'Maps',
        type: 'sub',
        collapse: 'maps',
        icontype: 'nc-icon nc-pin-3',
        children: [
            {path: 'google', title: 'Google Maps', ab:'GM'},
            {path: 'fullscreen', title: 'Full Screen Map', ab:'FSM'},
            {path: 'vector', title: 'Vector Map', ab:'VM'}
        ]
    },{
        path: '/widgets',
        title: 'Widgets',
        type: 'link',
        icontype: 'nc-icon nc-box'

    },{
        path: '/charts',
        title: 'Charts',
        type: 'link',
        icontype: 'nc-icon nc-chart-bar-32'

    },{
        path: '/calendar',
        title: 'Calendar',
        type: 'link',
        icontype: 'nc-icon nc-calendar-60'
    },{
        path: '/pages',
        title: 'Pages',
        collapse: 'pages',
        type: 'sub',
        icontype: 'nc-icon nc-book-bookmark',
        children: [
            {path: 'timeline', title: 'Timeline Page', ab:'T'},
            {path: 'user', title: 'User Page', ab:'UP'},
            {path: 'login', title: 'Login Page', ab:'LP'},
            {path: 'register', title: 'Register Page', ab:'RP'},
            {path: 'lock', title: 'Lock Screen Page', ab:'LSP'}
        ]
    }
]; */

@Component({
    moduleId: module.id,
    selector: 'sidebar-cmp',
    templateUrl: 'sidebar.component.html',
})

export class SidebarComponent {
    public menuItems: any[];
    isNotMobileMenu(){
        if( window.outerWidth > 991){
            return false;
        }
        return true;
    }

    ngOnInit() {
        this.menuItems = ROUTES.filter(menuItem => menuItem);
    }
    ngAfterViewInit(){
    }
}
