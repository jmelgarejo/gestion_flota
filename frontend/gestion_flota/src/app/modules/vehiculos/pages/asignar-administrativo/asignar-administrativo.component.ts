import { Component, OnInit } from '@angular/core';

declare var $:any;

declare interface DataTable {
    headerRow: string[];
    footerRow: string[];
    dataRows: string[][];
}

@Component({
  selector: 'app-asignar-administrativo',
  templateUrl: './asignar-administrativo.component.html',
  styleUrls: ['./asignar-administrativo.component.css']
})
export class AsignarAdministrativoComponent implements OnInit {
  public dataTable: DataTable;
  ngOnInit(){
      this.dataTable = {
          headerRow: [ 'ID', 'Cliente', 'Rut Solicitante', 'Vehículo', 'Fecha Solicitud', 'Administrativo', 'Acciones' ],
          footerRow: [],
          dataRows: [
            ['1', 'Apple', '18446622-8', 'Camioneta', '2023-02-03', 'Juan Pablo Tapia'],
            ['2', 'Samsung', '15283691-6', 'Rampla', '2023-05-15', 'Carolina Pérez'],
            ['3', 'Microsoft', '21674539-2', 'Camión 3/4', '2023-08-21', 'Felipe Gómez'],
            ['4', 'Google', '19874320-9', 'Camioneta', '2023-03-10', 'Andrea Rodríguez'],
            ['5', 'Amazon', '22750976-1', 'Rampla', '2023-07-05', 'Rodrigo Flores'],
            ['6', 'Apple', '17655381-4', 'Camión 3/4', '2023-04-17', 'Marcela Silva'],
            ['7', 'Samsung', '15167283-5', 'Camioneta', '2023-09-28', 'Ricardo Torres'],
            ['8', 'Microsoft', '20679342-3', 'Rampla', '2023-11-12', 'Valentina Morales'],
            ['9', 'Google', '19475162-7', 'Camión 3/4', '2023-10-03', 'Pablo Herrera'],
            ['10', 'Amazon', '22134599-8', 'Camioneta', '2023-12-30', 'Carolina Soto'],
            ['11', 'Apple', '17239825-2', 'Rampla', '2024-02-08', 'Manuel Fernández'],
            ['12', 'Samsung', '15573291-3', 'Camión 3/4', '2024-03-25', 'Camila Vargas'],
            ['13', 'Microsoft', '20349985-6', 'Camioneta', '2024-05-02', 'Fernando López'],
            ['14', 'Google', '19073288-1', 'Rampla', '2024-06-18', 'Valeria Torres'],
            ['15', 'Amazon', '21997674-7', 'Camión 3/4', '2024-07-31', 'Gonzalo Ramírez'],
            ['16', 'Apple', '16837843-9', 'Camioneta', '2024-09-13', 'Laura Morales'],
            ['17', 'Samsung', '14936721-4', 'Rampla', '2024-10-28', 'Diego Valenzuela'],
            ['18', 'Microsoft', '21674539-2', 'Camión 3/4', '2025-01-06', 'Carla Guzmán'],
            ['19', 'Google', '19475162-7', 'Camioneta', '2025-02-19', 'María Fernández'],
            ['20', 'Amazon', '22134599-8', 'Rampla', '2025-04-05', 'Javier Muñoz'],
            ['21', 'Apple', '17239825-2', 'Camioneta', '2025-06-14', 'Daniela Pérez'],
            ['22', 'Samsung', '15573291-3', 'Rampla', '2025-08-25', 'Sebastián Castro'],
            ['23', 'Microsoft', '20349985-6', 'Camión 3/4', '2025-10-07', 'Isabel Morales'],
            ['24', 'Google', '19073288-1', 'Camioneta', '2025-11-22', 'Roberto Soto'],
            ['25', 'Amazon', '21997674-7', 'Rampla', '2026-01-31', 'Natalia González'],
            ['26', 'Apple', '16837843-9', 'Camión 3/4', '2026-03-18', 'Mauricio Ramírez'],
            ['27', 'Samsung', '14936721-4', 'Camioneta', '2026-05-05', 'Cristina Valdivia'],
            ['28', 'Microsoft', '21674539-2', 'Rampla', '2026-06-20', 'Pedro Rojas'],
            ['29', 'Google', '19475162-7', 'Camión 3/4', '2026-08-08', 'Carolina Martínez'],
            ['30', 'Amazon', '22134599-8', 'Camioneta', '2026-09-23', 'Jorge Vargas']
          ]
       };
  }

  ngAfterViewInit(){
    $('#datatable-AA').DataTable({
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

    var table = $('#datatable-AA').DataTable();

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