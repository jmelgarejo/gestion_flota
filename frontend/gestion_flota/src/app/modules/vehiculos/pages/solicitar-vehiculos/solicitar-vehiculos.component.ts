import { Component, OnInit } from '@angular/core';

declare var $:any;

declare interface DataTable {
    headerRow: string[];
    footerRow: string[];
    dataRows: string[][];
}

@Component({
  selector: 'app-solicitar-vehiculos',
  templateUrl: './solicitar-vehiculos.component.html',
  styleUrls: ['./solicitar-vehiculos.component.css']
})
export class SolicitarVehiculosComponent implements OnInit {
  public dataTable: DataTable;
  ngOnInit(){
      this.dataTable = {
          headerRow: [ 'ID', 'Cliente', 'Rut Solicitante', 'Vehículo', 'Fecha Solicitud', 'Descripción', 'Acciones' ],
          footerRow: [],
          dataRows: [
            ['1', 'Apple', '18446622-8', 'Camioneta', '2023-02-03', 'Se solicita Camioneta para traslado de materiales de construcción livianos'],
            ['2', 'Samsung', '15283691-6', 'Camión 3/4', '2023-05-15', 'Se solicita Camión 3/4 para transporte de muebles de oficina'],
            ['3', 'Microsoft', '21674539-2', 'Rampla', '2023-08-21', 'Se solicita Rampla para traslado de maquinaria pesada'],
            ['4', 'Google', '19874320-9', 'Camioneta', '2023-03-10', 'Se solicita Camioneta para reparto de productos alimenticios'],
            ['5', 'Amazon', '22750976-1', 'Camión 3/4', '2023-07-05', 'Se solicita Camión 3/4 para transporte de mercadería a granel'],
            ['6', 'Apple', '17655381-4', 'Rampla', '2023-04-17', 'Se solicita Rampla para transporte de contenedores marítimos'],
            ['7', 'Samsung', '15167283-5', 'Camioneta', '2023-09-28', 'Se solicita Camioneta para entrega de paquetes en zonas urbanas'],
            ['8', 'Microsoft', '20679342-3', 'Camión 3/4', '2023-11-12', 'Se solicita Camión 3/4 para transporte de materiales de construcción'],
            ['9', 'Google', '19475162-7', 'Rampla', '2023-10-03', 'Se solicita Rampla para transporte de vehículos automotores'],
            ['10', 'Amazon', '22134599-8', 'Camioneta', '2023-12-30', 'Se solicita Camioneta para reparto de flores y plantas'],
            ['11', 'Apple', '17239825-2', 'Camión 3/4', '2024-02-08', 'Se solicita Camión 3/4 para transporte de electrodomésticos'],
            ['12', 'Samsung', '15573291-3', 'Rampla', '2024-03-25', 'Se solicita Rampla para transporte de productos químicos'],
            ['13', 'Microsoft', '20349985-6', 'Camioneta', '2024-05-02', 'Se solicita Camioneta para traslado de equipos de sonido'],
            ['14', 'Google', '19073288-1', 'Camión 3/4', '2024-06-18', 'Se solicita Camión 3/4 para distribución de productos de limpieza'],
            ['15', 'Amazon', '21997674-7', 'Rampla', '2024-07-31', 'Se solicita Rampla para transporte de carga refrigerada'],
            ['16', 'Apple', '16837843-9', 'Camioneta', '2024-09-13', 'Se solicita Camioneta para reparto de productos farmacéuticos'],
            ['17', 'Samsung', '14936721-4', 'Camión 3/4', '2024-10-28', 'Se solicita Camión 3/4 para transporte de materiales de construcción'],
            ['18', 'Microsoft', '21674539-2', 'Rampla', '2025-01-06', 'Se solicita Rampla para transporte de maquinaria agrícola'],
            ['19', 'Google', '19475162-7', 'Camioneta', '2025-02-19', 'Se solicita Camioneta para reparto de productos perecederos'],
            ['20', 'Amazon', '22134599-8', 'Camión 3/4', '2025-04-05', 'Se solicita Camión 3/4 para transporte de materiales de construcción'],
            ['21', 'Apple', '17239825-2', 'Rampla', '2025-06-14', 'Se solicita Rampla para transporte de productos químicos'],
            ['22', 'Samsung', '15573291-3', 'Camioneta', '2025-08-25', 'Se solicita Camioneta para reparto de productos electrónicos'],
            ['23', 'Microsoft', '20349985-6', 'Camión 3/4', '2025-10-07', 'Se solicita Camión 3/4 para transporte de muebles de hogar'],
            ['24', 'Google', '19073288-1', 'Rampla', '2025-11-22', 'Se solicita Rampla para transporte de carga a granel'],
            ['25', 'Amazon', '21997674-7', 'Camioneta', '2026-01-31', 'Se solicita Camioneta para reparto de paquetes pequeños'],
            ['26', 'Apple', '16837843-9', 'Camión 3/4', '2026-03-18', 'Se solicita Camión 3/4 para transporte de productos químicos'],
            ['27', 'Samsung', '14936721-4', 'Rampla', '2026-05-05', 'Se solicita Rampla para transporte de productos alimenticios'],
            ['28', 'Microsoft', '21674539-2', 'Camioneta', '2026-06-20', 'Se solicita Camioneta para reparto de productos de belleza'],
            ['29', 'Google', '19475162-7', 'Camión 3/4', '2026-08-08', 'Se solicita Camión 3/4 para transporte de equipos de construcción'],
            ['30', 'Amazon', '22134599-8', 'Rampla', '2026-09-23', 'Se solicita Rampla para transporte de productos congelados']
          ]
       };
  }

  ngAfterViewInit(){
    $('#datatable-SV').DataTable({
      "pagingType": "full_numbers",
      "lengthMenu": [
        [10, 25, 50, -1],
        [10, 25, 50, "All"]
      ],
      responsive: true,
      language: {
        search: "_INPUT_",
        searchPlaceholder: "Buscar",
      }

    });

    var table = $('#datatable-SV').DataTable();

    // Edit record
    table.on('click', '.edit', function() {
      let $tr = $(this).closest('tr');

      var data = table.row($tr).data();
      alert('You press on Row: ' + data[0] + ' ' + data[1] + ' ' + data[2] + '\'s row.');
    });

    // Delete a record
    table.on('click', '.remove', function(e) {
      let $tr = $(this).closest('tr');
      table.row($tr).remove().draw();
      e.preventDefault();
    });

    //Like record
    table.on('click', '.like', function() {
      alert('You clicked on Like button');
    });
  }
}