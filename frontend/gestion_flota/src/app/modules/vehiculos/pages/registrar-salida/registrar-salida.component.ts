import { Component, OnInit } from '@angular/core';

declare var $:any;

declare interface DataTable {
    headerRow: string[];
    footerRow: string[];
    dataRows: string[][];
}

@Component({
  selector: 'app-registrar-salida',
  templateUrl: './registrar-salida.component.html',
  styleUrls: ['./registrar-salida.component.css']
})
export class RegistrarSalidaComponent implements OnInit {
  public dataTable: DataTable;
  ngOnInit(){
      this.dataTable = {
          headerRow: [ 'ID', 'Patente', 'Tipo', 'Fecha Salida', 'Acciones' ],
          footerRow: [],
          dataRows: [
            ['1', 'CVBX14', 'Camioneta', '2023-04-01'],
            ['2', 'GHTY76', 'Camión 3/4', '2023-01-25'],
            ['3', 'KLPO29', 'Rampla', '2023-02-01'],
            ['4', 'QWED84', 'Camioneta', '2023-02-05'],
            ['5', 'NBVC92', 'Camión 3/4', '2023-03-12'],
            ['6', 'ZXCV53', 'Rampla', '2023-04-02'],
            ['7', 'MNOP78', 'Camioneta', '2023-04-01'],
            ['8', 'JKLK12', 'Camión 3/4', '2023-02-01'],
            ['9', 'BVCX45', 'Rampla', '2023-05-01'],
            ['10', 'POIU35', 'Camioneta', '2023-04-12'],
            ['11', 'RTYU67', 'Camión 3/4', '2023-04-24'],
            ['12', 'DFGB89', 'Rampla', '2023-04-30'],
            ['13', 'XCVB15', 'Camioneta', '2023-01-11'],
            ['14', 'ASDF32', 'Camión 3/4', '2023-02-15'],
            ['15', 'QWERT41', 'Rampla', '2023-01-01']
          ]
       };
  }

  ngAfterViewInit(){
    $('#datatable-RS').DataTable({
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

    var table = $('#datatable-RS').DataTable();

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

