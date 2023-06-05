import { Component, OnInit } from '@angular/core';
import { LlamadaApiService } from '../../services/llamada-api.service';
declare let $:any;

declare interface DataTable {
    headerRow: string[];
    footerRow: string[];
    dataRows: string[][];
}
@Component({
  selector: 'app-listado-pokemon',
  templateUrl: './listado-pokemon.component.html',
  styleUrls: ['./listado-pokemon.component.css']
})
export class ListadoPokemonComponent implements OnInit {
  data: any;
  pokemonList: any[];
  public dataTable: DataTable;

  constructor(private pokemonService: LlamadaApiService) { }
  ngOnInit(){
    this.getPokemon();
  }

  async getPokemon() {
    try {
      this.pokemonList = await this.pokemonService.getPokemon();
      console.log(this.pokemonList);

      this.dataTable = {
        headerRow: [ 'ID', 'Nombre Pokemon', 'Url Pokemon'],
        footerRow: [],
        dataRows: [
          this.pokemonList
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
