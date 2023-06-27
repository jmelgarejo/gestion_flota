import { Component, OnInit } from '@angular/core';
import { RegistrarSalidasService } from '../../services/registrar-salidas.service';
import { FormControl, FormGroup } from '@angular/forms';
import { VehiculosDisponiblesService } from '../../services/vehiculos-disponibles.service';
import Swal from 'sweetalert2'

declare let $:any;

declare interface DataTable {
    headerRow: string[];
    footerRow: string[];
    dataRows: string[][];
}
@Component({
  selector: 'app-registrar-salidas',
  templateUrl: './registrar-salidas.component.html',
  styleUrls: ['./registrar-salidas.component.scss']
})
export class RegistrarSalidasComponent implements OnInit {
  maxId: any;
  form: FormGroup;
  formEdit: FormGroup;
  listadoVehiculos: any[];
  data: any;
  salidaList: any[];
  editarSalida: any;
  public dataTable: DataTable;

  constructor(private salidaService: RegistrarSalidasService,private vehiculosService: VehiculosDisponiblesService) { }
  async ngOnInit(){
    
    
    this.form = new FormGroup({
      patente: new FormControl(''),
      salidaDate: new FormControl('')  // Este campo se vinculará al input de fecha en la plantilla
    });

    this.formEdit = new FormGroup({
      id: new FormControl(''),
      patente: new FormControl(''),
      salidaDate: new FormControl('')  // Este campo se vinculará al input de fecha en la plantilla
    });
    
    this.getSalidas();
    this.listadoVehiculos = await this.vehiculosService.getVehiculos();
  }

  async getSalidas() {
    try {
      this.salidaList = await this.salidaService.getSalidas();
      this.maxId = this.salidaList.length;

      this.dataTable = {
        headerRow: [ 'ID Salida', 'Patente', 'Estado','Fecha Salida','Acciones'],
        footerRow: [],
        dataRows: [
          this.salidaList
        ]
      };

    } catch (error) {
      console.error(error);
    }
  }
  
  async enviarDatos() {
    const id = this.maxId+1; 
    const estado = "normal"; 
    const patente = this.form.get('patente').value;
    const create_at = this.form.get('salidaDate').value;

    Swal.fire({
      title: 'Está seguro?',
      text: "",
      icon: 'warning',
      showCancelButton: true,
      confirmButtonColor: '#3085d6',
      cancelButtonColor: '#d33',
      confirmButtonText: 'Sí, Agrégalo!'
    }).then((result) => {
      if (result.isConfirmed) {
        
        this.salidaService.postSalidas(id, create_at, estado, patente);

        Swal.fire(
          'Agregado!',
          'El registro de salida ha sido agregado.',
          'success'
        )

        window.location.reload();
      }
    })
    
  }



  async editarDatos(salida){
    console.log("EDITAR DATOS");
    
    this.formEdit.patchValue({
      id: salida.id,
      patente: salida.patente,
      salidaDate: salida.createAT
  });
    
  }

  async enviarDatosEdit() {
    
    const id = this.formEdit.get('id').value;
    const patente = this.formEdit.get('patente').value;
    const create_at = this.formEdit.get('salidaDate').value;
    const estado = 'normal';
    
    console.log(patente);
    console.log(create_at);
    console.log(id);
    
    Swal.fire({
      title: 'Está seguro?',
      text: "",
      icon: 'warning',
      showCancelButton: true,
      confirmButtonColor: '#3085d6',
      cancelButtonColor: '#d33',
      confirmButtonText: 'Sí, Modifícalo!'
    }).then((result) => {
      if (result.isConfirmed) {
        
        this.salidaService.putSalidas(id, create_at, estado, patente);

        Swal.fire(
          'Agregado!',
          'El registro de salida ha sido modificado.',
          'success'
        )

        window.location.reload();
      }
    })

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

    let table = $('#datatable-RS').DataTable();

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

