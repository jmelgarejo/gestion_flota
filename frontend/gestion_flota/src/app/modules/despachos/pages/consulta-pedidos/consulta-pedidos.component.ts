import { Component, OnInit } from '@angular/core';

declare var $:any;

declare interface DataTable {
    headerRow: string[];
    footerRow: string[];
    dataRows: string[][];
}

@Component({
  selector: 'app-consulta-pedidos',
  templateUrl: './consulta-pedidos.component.html',
  styleUrls: ['./consulta-pedidos.component.css']
})
export class ConsultaPedidosComponent implements OnInit {

  public dataTable: DataTable;
    ngOnInit(){
        this.dataTable = {
            headerRow: [ 'ID', 'Cliente', 'Tipo Servicio', 'Fecha Solicitud', 'Estado', 'Origen', 'Destino' ],
            footerRow: [],
            dataRows: [
              ['1', 'Huawei', 'Camioneta', '2023-01-25', 'En ruta', 'Casa Matriz', 'Entel'],
              ['2', 'Apple', 'Rampla', '2023-02-10', 'Entregado', 'CD el Belloto', 'Falabella'],
              ['3', 'Samsung', 'Camión 3/4', '2023-03-05', 'En ruta', 'Danco', 'APL Logistics'],
              ['4', 'Sony', 'Camioneta', '2023-04-15', 'Entregado', 'Casa Matriz', 'ATL'],
              ['5', 'Microsoft', 'Rampla', '2023-02-28', 'En ruta', 'CD el Belloto', 'Entel'],
              ['6', 'LG', 'Camión 3/4', '2023-03-18', 'Entregado', 'Danco', 'Falabella'],
              ['7', 'Google', 'Camioneta', '2023-05-02', 'En ruta', 'Casa Matriz', 'APL Logistics'],
              ['8', 'Amazon', 'Rampla', '2023-04-01', 'Entregado', 'CD el Belloto', 'ATL'],
              ['9', 'Facebook', 'Camión 3/4', '2023-02-15', 'En ruta', 'Danco', 'Entel'],
              ['10', 'Intel', 'Camioneta', '2023-03-10', 'Entregado', 'Casa Matriz', 'Falabella'],
              ['11', 'IBM', 'Rampla', '2023-05-05', 'En ruta', 'CD el Belloto', 'APL Logistics'],
              ['12', 'Oracle', 'Camión 3/4', '2023-04-20', 'Entregado', 'Danco', 'ATL'],
              ['13', 'HP', 'Camioneta', '2023-01-28', 'En ruta', 'Casa Matriz', 'Entel'],
              ['14', 'Lenovo', 'Rampla', '2023-02-12', 'Entregado', 'CD el Belloto', 'Falabella'],
              ['15', 'Dell', 'Camión 3/4', '2023-03-08', 'En ruta', 'Danco', 'APL Logistics'],
              ['16', 'Cisco', 'Camioneta', '2023-04-17', 'Entregado', 'Casa Matriz', 'ATL'],
              ['17', 'Adobe', 'Rampla', '2023-02-26', 'En ruta', 'CD el Belloto', 'Entel'],
              ['18', 'VMware', 'Camión 3/4', '2023-03-20', 'Entregado', 'Danco', 'Falabella'],
              ['19', 'NVIDIA', 'Camioneta', '2023-05-04', 'En ruta', 'Casa Matriz', 'APL Logistics'],
              ['20', 'Netflix', 'Rampla', '2023-04-05', 'Entregado', 'CD el Belloto', 'ATL'],
              ['21', 'Tesla', 'Camión 3/4', '2023-02-18', 'En ruta', 'Danco', 'Entel'],
              ['22', 'Uber', 'Camioneta', '2023-03-15', 'Entregado', 'Casa Matriz', 'Falabella'],
              ['23', 'Airbnb', 'Rampla', '2023-05-08', 'En ruta', 'CD el Belloto', 'APL Logistics'],
              ['24', 'Spotify', 'Camión 3/4', '2023-04-25', 'Entregado', 'Danco', 'ATL'],
              ['25', 'Twitter', 'Camioneta', '2023-02-02', 'En ruta', 'Casa Matriz', 'Entel'],
              ['26', 'Snapchat', 'Rampla', '2023-02-14', 'Entregado', 'CD el Belloto', 'Falabella'],
              ['27', 'LinkedIn', 'Camión 3/4', '2023-03-12', 'En ruta', 'Danco', 'APL Logistics'],
              ['28', 'TikTok', 'Camioneta', '2023-04-22', 'Entregado', 'Casa Matriz', 'ATL'],
              ['29', 'Pinterest', 'Rampla', '2023-02-24', 'En ruta', 'CD el Belloto', 'Entel'],
              ['30', 'Alibaba', 'Camión 3/4', '2023-03-25', 'Entregado', 'Danco', 'Falabella'],
              ['31', 'Tencent', 'Camioneta', '2023-05-01', 'En ruta', 'Casa Matriz', 'APL Logistics'],
              ['32', 'Riot Games', 'Rampla', '2023-04-08', 'Entregado', 'CD el Belloto', 'ATL'],
              ['33', 'Adobe', 'Camión 3/4', '2023-02-05', 'En ruta', 'Danco', 'Entel'],
              ['34', 'Facebook', 'Camioneta', '2023-03-02', 'Entregado', 'Casa Matriz', 'Falabella'],
              ['35', 'Netflix', 'Rampla', '2023-05-07', 'En ruta', 'CD el Belloto', 'APL Logistics'],
              ['36', 'Microsoft', 'Camión 3/4', '2023-04-12', 'Entregado', 'Danco', 'ATL'],
              ['37', 'Amazon', 'Camioneta', '2023-02-08', 'En ruta', 'Casa Matriz', 'Entel'],
              ['38', 'Google', 'Rampla', '2023-02-20', 'Entregado', 'CD el Belloto', 'Falabella'],
              ['39', 'Apple', 'Camión 3/4', '2023-03-16', 'En ruta', 'Danco', 'APL Logistics'],
              ['40', 'Samsung', 'Camioneta', '2023-04-29', 'Entregado', 'Casa Matriz', 'ATL'],
              ['41', 'Intel', 'Rampla', '2023-02-10', 'En ruta', 'CD el Belloto', 'Entel'],
              ['42', 'Oracle', 'Camión 3/4', '2023-03-05', 'Entregado', 'Danco', 'Falabella']
            ]
         };
    }

    ngAfterViewInit(){
      $('#datatable-CP').DataTable({
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

      var table = $('#datatable-CP').DataTable();

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
