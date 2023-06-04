import { Component, OnInit } from '@angular/core';

declare var $:any;

declare interface DataTable {
    headerRow: string[];
    footerRow: string[];
    dataRows: string[][];
}


@Component({
  selector: 'app-vehiculos-disponibles',
  templateUrl: './vehiculos-disponibles.component.html',
  styleUrls: ['./vehiculos-disponibles.component.css']
})
export class VehiculosDisponiblesComponent implements OnInit {
  public dataTable: DataTable;
  ngOnInit(){
      this.dataTable = {
          headerRow: [ 'ID', 'Patente', 'Tipo', 'Descripción', 'Acciones' ],
          footerRow: [],
          dataRows: [
            ['1', 'CVBX14', 'Camioneta', 'Camioneta marca Chevrolet'],
            ['2', 'GHTY76', 'Camión 3/4', 'Camión 3/4 marca Ford modelo F-350'],
            ['3', 'KLPO29', 'Rampla', 'Rampla marca Volvo modelo FH16'],
            ['4', 'QWED84', 'Camioneta', 'Camioneta marca Toyota modelo Hilux'],
            ['5', 'NBVC92', 'Camión 3/4', 'Camión 3/4 marca Isuzu modelo NPR'],
            ['6', 'ZXCV53', 'Rampla', 'Rampla marca Scania modelo R500'],
            ['7', 'MNOP78', 'Camioneta', 'Camioneta marca Ford modelo Ranger'],
            ['8', 'JKLK12', 'Camión 3/4', 'Camión 3/4 marca Mercedes-Benz modelo Sprinter'],
            ['9', 'BVCX45', 'Rampla', 'Rampla marca DAF modelo XF105'],
            ['10', 'POIU35', 'Camioneta', 'Camioneta marca Nissan modelo Frontier'],
            ['11', 'RTYU67', 'Camión 3/4', 'Camión 3/4 marca Hino modelo 300'],
            ['12', 'DFGB89', 'Rampla', 'Rampla marca MAN modelo TGX'],
            ['13', 'XCVB15', 'Camioneta', 'Camioneta marca Mitsubishi modelo L200'],
            ['14', 'ASDF32', 'Camión 3/4', 'Camión 3/4 marca Hyundai modelo HD78'],
            ['15', 'QWERT41', 'Rampla', 'Rampla marca Iveco modelo Stralis']
          ]
       };
  }

  ngAfterViewInit(){
    $('#datatable-VD').DataTable({
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

    var table = $('#datatable-VD').DataTable();

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
