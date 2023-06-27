import { Component, OnInit } from '@angular/core';
import { SolicitarVehiculoService } from '../../services/solicitar-vehiculo.service';
import Swal from 'sweetalert2'
import { FormControl, FormGroup } from '@angular/forms';

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

  maxId: any;
  form: FormGroup;
  formEdit: FormGroup;
  data: any;
  solicitudList: any[];
  public dataTable: DataTable;

  constructor(private solicitudService: SolicitarVehiculoService) { }
  ngOnInit(){

    this.form = new FormGroup({
      clienteID: new FormControl(''),
      planificacionID:new FormControl(''),
      estado:new FormControl(''),
      origen:new FormControl(''),
      destino:new FormControl(''),
      fecha_solicitud:new FormControl(''),
      fecha_entrega:new FormControl('')
    });

    this.formEdit = new FormGroup({
      id:new FormControl(''),
      patente: new FormControl(''),
      clienteID: new FormControl(''),
      planificacionID:new FormControl(''),
      estado:new FormControl(''),
      origen:new FormControl(''),
      destino:new FormControl(''),
      fecha_solicitud:new FormControl(''),
      fecha_entrega:new FormControl('')
    });

    this.getSolicitudes();
  }

  async getSolicitudes() {
    try {
      this.solicitudList = await this.solicitudService.getSolicitudes();
      this.maxId = this.solicitudList.length;
      console.log("this.maxId");
      console.log(this.maxId);
      
      console.log("LISTADO SOLICITUDES EN EL FRONT");
      
      console.log(this.solicitudList);

      this.dataTable = {
        headerRow: [ 'ID Solicitud','Estado', 'Origen','Destino', 'Planificación','Acciones'],
        footerRow: [],
        dataRows: [
          this.solicitudList
        ]
      };

    } catch (error) {
      console.error(error);
    }
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

    let table = $('#datatable-SV').DataTable();

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

    console.log("etre enviar");
    
    const id = this.maxId+1; 
    const cliente_id = 5;
    const planificacion_id = 8;
    const estado = "Pendiente";
    const origen = this.form.get('origen').value;
    const destino = this.form.get('destino').value;
    const fecha_solicitud = new Date("2023-06-27");
    const fecha_entrega = new Date("2023-07-27");

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
        
        this.solicitudService.postSolicitudes(id,cliente_id,planificacion_id,estado,origen,destino,fecha_solicitud,fecha_entrega);

        Swal.fire(
          'Agregado!',
          'El registro de salida ha sido agregado.',
          'success'
        )

        //window.location.reload();
      }
    })
    
  }



  async editarDatos(solicitud){
    console.log("EDITAR DATOS");
    console.log(solicitud);
    
  
    this.formEdit.patchValue({
      id:solicitud.id,
      patente: solicitud.patente,
      salidaDate: solicitud.salidaDate,
      clienteID: solicitud.clienteID,
      planificacionID:solicitud.planificacionID,
      estado:solicitud.estado,
      origen:solicitud.origen,
      destino:solicitud.destino,
      fecha_solicitud:solicitud.fecha_solicitud,
      fecha_entrega:solicitud.fecha_entrega
    });

  }

  async enviarDatosEdit() {
    
    const id = this.formEdit.get('id').value;
    const cliente_id = this.formEdit.get('cliente_id').value;
    const planificacion_id = this.formEdit.get('planificacion_id').value;
    const estado = this.formEdit.get('estado').value;
    const origen = this.formEdit.get('origen').value;
    const destino = this.formEdit.get('destino').value;
    const fecha_solicitud = this.formEdit.get('fecha_solicitud').value;
    const fecha_entrega = this.formEdit.get('fecha_entrega').value;

    
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
        
        this.solicitudService.putSolicitudes(id,cliente_id,planificacion_id,estado,origen,destino,fecha_solicitud,fecha_entrega);

        Swal.fire(
          'Agregado!',
          'El registro de solicitud ha sido modificado.',
          'success'
        )

        window.location.reload();
      }
    })

  }

}