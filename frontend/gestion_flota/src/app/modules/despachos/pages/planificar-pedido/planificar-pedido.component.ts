import { Component, OnInit } from '@angular/core';

declare var $:any;

declare interface DataTable {
    headerRow: string[];
    footerRow: string[];
    dataRows: string[][];
}


@Component({
  selector: 'app-planificar-pedido',
  templateUrl: './planificar-pedido.component.html',
  styleUrls: ['./planificar-pedido.component.css']
})
export class PlanificarPedidoComponent implements OnInit {
  public dataTable: DataTable;
  ngOnInit(){
      this.dataTable = {
          headerRow: [ 'ID', 'Mandante', 'Fecha Creación', 'Conductor', 'Estado', 'Hora Salida', 'Hora Llegada', 'Origen', 'Destino', 'Acciones' ],
          footerRow: [],
          dataRows: [
            ['1', 'Apple', '2023-01-25', 'Arturo Sanchez', 'En ruta', '09:00 am', '15:00 pm', 'Casa Matriz', 'Entel'],
            ['2', 'Samsung', '2023-02-14', 'María Contreras', 'Despachado', '08:30 am', '12:45 pm', 'CD El Belloto', 'Movistar'],
            ['3', 'Microsoft', '2023-03-02', 'Luis Morales', 'En ruta', '11:15 am', '17:30 pm', 'Danco', 'Claro'],
            ['4', 'Google', '2023-04-10', 'Alejandra Rodríguez', 'En ruta', '10:45 am', '16:20 pm', 'Casa Matriz', 'VTR'],
            ['5', 'Amazon', '2023-05-01', 'Carlos Mendoza', 'Despachado', '09:30 am', '14:10 pm', 'CD El Belloto', 'Entel'],
            ['6', 'Apple', '2023-06-18', 'Fernanda Silva', 'En ruta', '13:20 pm', '18:45 pm', 'Danco', 'Movistar'],
            ['7', 'Samsung', '2023-07-07', 'Andrés Torres', 'En ruta', '08:00 am', '13:30 pm', 'Casa Matriz', 'Claro'],
            ['8', 'Microsoft', '2023-08-24', 'Javiera Herrera', 'Despachado', '11:45 am', '16:15 pm', 'CD El Belloto', 'VTR'],
            ['9', 'Google', '2023-09-13', 'Pedro Rojas', 'En ruta', '10:15 am', '15:50 pm', 'Danco', 'Entel'],
            ['10', 'Amazon', '2023-10-30', 'Laura Torres', 'Despachado', '09:50 am', '13:40 pm', 'Casa Matriz', 'Movistar'],
            ['11', 'Apple', '2023-11-17', 'Gabriel Fuentes', 'En ruta', '12:30 pm', '19:00 pm', 'Danco', 'Claro'],
            ['12', 'Samsung', '2023-12-04', 'Valentina Ortiz', 'En ruta', '08:30 am', '14:40 pm', 'CD El Belloto', 'VTR'],
            ['13', 'Microsoft', '2024-01-21', 'Sebastián Castro', 'Despachado', '10:15 am', '15:25 pm', 'Casa Matriz', 'Entel'],
            ['14', 'Google', '2024-02-08', 'Daniela Morales', 'En ruta', '11:30 am', '17:20 pm', 'Danco', 'Movistar'],
            ['15', 'Amazon', '2024-03-26', 'Hugo Espinoza', 'Despachado', '09:45 am', '13:55 pm', 'CD El Belloto', 'Claro'],
            ['16', 'Apple', '2024-04-12', 'Isabel Rivas', 'En ruta', '13:00 pm', '19:30 pm', 'Casa Matriz', 'VTR'],
            ['17', 'Samsung', '2024-05-29', 'Diego Álvarez', 'En ruta', '08:15 am', '13:55 pm', 'Danco', 'Entel'],
            ['18', 'Microsoft', '2024-06-15', 'Marcela González', 'Despachado', '10:30 am', '16:00 pm', 'CD El Belloto', 'Movistar'],
            ['19', 'Google', '2024-07-02', 'Fernando Morales', 'En ruta', '09:00 am', '14:30 pm', 'Casa Matriz', 'Claro'],
            ['20', 'Amazon', '2024-08-19', 'Paulina Castro', 'Despachado', '11:45 am', '16:35 pm', 'Danco', 'VTR'],
            ['21', 'Apple', '2024-09-06', 'Rodrigo Silva', 'En ruta', '12:15 pm', '18:45 pm', 'CD El Belloto', 'Entel'],
            ['22', 'Samsung', '2024-10-23', 'Mariana Pérez', 'En ruta', '08:30 am', '13:10 pm', 'Casa Matriz', 'Movistar'],
            ['23', 'Microsoft', '2024-11-09', 'Ignacio Espinoza', 'Despachado', '10:00 am', '14:50 pm', 'Danco', 'Claro'],
            ['24', 'Google', '2024-12-26', 'Camila Araya', 'En ruta', '11:20 am', '17:40 pm', 'CD El Belloto', 'VTR'],
            ['25', 'Amazon', '2025-01-12', 'Cristóbal Rojas', 'Despachado', '09:30 am', '13:45 pm', 'Casa Matriz', 'Entel'],
            ['26', 'Apple', '2025-02-28', 'Antonia Soto', 'En ruta', '12:45 pm', '19:15 pm', 'Danco', 'Movistar'],
            ['27', 'Samsung', '2025-03-17', 'Benjamín Castro', 'En ruta', '08:00 am', '14:30 pm', 'Casa Matriz', 'Claro'],
            ['28', 'Microsoft', '2025-04-03', 'Valeria Morales', 'Despachado', '10:45 am', '16:10 pm', 'CD El Belloto', 'VTR'],
            ['29', 'Google', '2025-05-20', 'José González', 'En ruta', '09:15 am', '15:50 pm', 'Danco', 'Entel'],
            ['30', 'Amazon', '2025-06-06', 'Isabella Ríos', 'Despachado', '11:30 am', '15:40 pm', 'Casa Matriz', 'Movistar']
          ]
       };
  }

  ngAfterViewInit(){
    $('#datatable-PP').DataTable({
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

    var table = $('#datatable-PP').DataTable();

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
