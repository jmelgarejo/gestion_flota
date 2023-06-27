import { Component, OnInit } from '@angular/core';
import { VehiculosDisponiblesService } from '../../services/vehiculos-disponibles.service';
import Swal from 'sweetalert2'
import { FormControl, FormGroup } from '@angular/forms';

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


  maxId: any;
  form: FormGroup;
  formEdit: FormGroup;
  data: any;
  vehiculosList: any[];
  public dataTable: DataTable;

  constructor(private vehiculosService: VehiculosDisponiblesService) { }
  ngOnInit(){

    this.form = new FormGroup({
      patente: new FormControl(''),
      numero_motor: new FormControl(''),
      fecha_revision_tecnica: new FormControl(''),
      marca:new FormControl(''),
      anio:new FormControl(''),
      modelo:new FormControl(''),
      poliza:new FormControl(''),
      fecha_ingreso:new FormControl('')
    });

    this.formEdit = new FormGroup({
      id:new FormControl(''),
      patente: new FormControl(''),
      numero_motor: new FormControl(''),
      fecha_revision_tecnica: new FormControl(''),
      marca:new FormControl(''),
      anio:new FormControl(''),
      modelo:new FormControl(''),
      poliza:new FormControl(''),
      fecha_ingreso:new FormControl('')
    });

    this.getSalidas();
  }

  async getSalidas() {
    try {
      this.vehiculosList = await this.vehiculosService.getVehiculos();
      this.maxId = this.vehiculosList.length;
      console.log("LISTADO VEHICULOS EN EL FRONT");
      
      console.log(this.vehiculosList);

      this.dataTable = {
        headerRow: [ 'ID Vehículo', 'Patente', 'Marca','Año','Modelo','Poliza','Acciones'],
        footerRow: [],
        dataRows: [
          this.vehiculosList
        ]
      };

    } catch (error) {
      console.error(error);
    }
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

    let table = $('#datatable-VD').DataTable();

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

  async enviarDatos() {
    const id_vehiculo = this.maxId+1;
    const patente = this.form.get('patente').value;
    const numero_motor = this.form.get('numero_motor').value;
    const fecha_revision_tecnica = this.form.get('fecha_revision_tecnica').value;
    const marca = this.form.get('marca').value;
    const anio = this.form.get('anio').value;
    const modelo = this.form.get('modelo').value;
    const poliza = this.form.get('poliza').value;
    const fecha_ingreso = this.form.get('fecha_ingreso').value;

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
        
        this.vehiculosService.postVehiculos(id_vehiculo,patente,numero_motor,fecha_revision_tecnica,marca, anio,modelo,poliza,fecha_ingreso);

        Swal.fire(
          'Agregado!',
          'El registro de salida ha sido agregado.',
          'success'
        )

        window.location.reload();
      }
    })
    
  }



  async editarDatos(vehiculo){
    console.log("EDITAR DATOS");
    
    this.formEdit.patchValue({
      id:vehiculo.id_vehiculo,
      patente:vehiculo.patente,
      numero_motor: vehiculo.numero_motor,
      fecha_revision_tecnica: vehiculo.fecha_revision_tecnica,
      marca:vehiculo.marca,
      anio:vehiculo.anio,
      modelo:vehiculo.modelo,
      poliza:vehiculo.poliza,
      fecha_ingreso:vehiculo.fecha_ingreso,
  });
    
  }

  async enviarDatosEdit() {
    
    const id_vehiculo = this.formEdit.get('id').value;
    const patente = this.formEdit.get('patente').value;
    const numero_motor = this.formEdit.get('numero_motor').value;
    const fecha_revision_tecnica = this.formEdit.get('fecha_revision_tecnica').value;
    const marca = this.formEdit.get('marca').value;
    const anio = this.formEdit.get('anio').value;
    const modelo = this.formEdit.get('modelo').value;
    const poliza = this.formEdit.get('poliza').value;
    const fecha_ingreso = this.formEdit.get('fecha_ingreso').value;
    
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
        
        this.vehiculosService.putVehiculos(id_vehiculo,patente,numero_motor,fecha_revision_tecnica,marca, anio,modelo,poliza,fecha_ingreso);

        Swal.fire(
          'Agregado!',
          'El Vehículo ha sido modificado.',
          'success'
        )

        window.location.reload();
      }
    })

  }
}
