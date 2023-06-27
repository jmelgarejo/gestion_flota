import { Component, OnInit } from '@angular/core';
import { AsignarAdministrativosService } from '../../services/asignar-administrativos.service';
declare let $:any;

declare interface DataTable {
    headerRow: string[];
    footerRow: string[];
    dataRows: string[][];
}

@Component({
  selector: 'app-asignar-administrativo',
  templateUrl: './asignar-administrativo.component.html',
  styleUrls: ['./asignar-administrativo.component.scss']
})
export class AsignarAdministrativoComponent implements OnInit {
  
  data: any;
  adminList: any[];
  public dataTable: DataTable;

  constructor(private administrativosService: AsignarAdministrativosService) { }
  ngOnInit(){
    this.getAdministrativos();
  }

  async getAdministrativos() {
    try {
      this.adminList = await this.administrativosService.getAdministrativos();

      console.log("LISTADO ADMIN EN EL FRONT ->");

      console.log(this.adminList);

      this.dataTable = {
        headerRow: [ 'ID', 'Nombre Pokemon', 'Url Pokemon'],
        footerRow: [],
        dataRows: [
          this.adminList
        ]
      };

    } catch (error) {
      console.error(error);
    }
  }

  ngAfterViewInit(){
    $('#datatable-LP').DataTable({
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

    let table = $('#datatable-LP').DataTable();

    // Edit record
    table.on('click', '.edit', function() {
      let $tr = $(this).closest('tr');

      let data = table.row($tr).data();
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
