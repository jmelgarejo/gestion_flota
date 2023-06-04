import { Component, OnInit } from '@angular/core';

declare let $:any;

declare interface DataTable {
    headerRow: string[];
    footerRow: string[];
    dataRows: string[][];
}

@Component({
  moduleId: module.id,
  selector: 'app-ingresar-retorno',
  templateUrl: './ingresar-retorno.component.html',
  styleUrls: ['./ingresar-retorno.component.scss']
})
export class IngresarRetornoComponent implements OnInit {
    data: any;

    public dataTable: DataTable;
    ngOnInit(){
     

      this.dataTable = {
          headerRow: [ 'ID', 'Patente', 'Conductor', 'Salida', 'Retorno', 'Incidente', 'Acciones' ],
          footerRow: [],
          dataRows: [
            ['1', 'CVBX14', '18446622-8', '2023-01-25', '2023-01-27', 'Hubo un ligero retraso en el trayecto debido a barricadas en el sector de Recoleta'],
            ['2', 'GYT789', '16327655-6', '2023-02-03', '2023-02-05', 'El vehículo sufrió una avería en el motor durante el viaje'],
            ['3', 'ZXQ567', '19785432-9', '2023-02-10', '2023-02-12', 'Se presentaron condiciones climáticas adversas en la ruta'],
            ['4', 'POI321', '13579086-1', '2023-02-15', '2023-02-17', 'No se reportaron incidentes durante el viaje'],
            ['5', 'FDS456', '12654321-4', '2023-02-20', '2023-02-22', 'Se registraron demoras en el despacho de la carga'],
            ['6', 'JIK987', '17543210-7', '2023-02-25', '2023-02-27', 'Se requirió realizar una parada no planificada para mantenimiento'],
            ['7', 'LOP123', '18765432-8', '2023-03-03', '2023-03-05', 'El vehículo fue escoltado por medidas de seguridad'],
            ['8', 'QWE789', '16345098-5', '2023-03-10', '2023-03-12', 'Se realizó una descarga de emergencia en ruta'],
            ['9', 'BNM567', '19123456-3', '2023-03-15', '2023-03-17', 'El vehículo fue detenido para una inspección aduanera'],
            ['10', 'TYU321', '15098765-2', '2023-03-20', '2023-03-22', 'Hubo congestión vehicular en la entrada a la ciudad'],
            ['11', 'ASD987', '17893456-1', '2023-03-25', '2023-03-27', 'El conductor sufrió una leve lesión en ruta'],
            ['12', 'HJK654', '13657890-0', '2023-03-30', '2023-04-01', 'Se registraron obras en construcción en la ruta'],
            ['13', 'WER321', '19543210-K', '2023-04-05', '2023-04-07', 'El vehículo requirió un cambio de neumáticos'],
            ['14', 'IOP987', '19283746-5', '2023-04-10', '2023-04-12', 'El trayecto se completó sin incidentes'],
            ['15', 'GHJ567', '18574639-2', '2023-04-15', '2023-04-17', 'Se registraron demoras en el tránsito por un accidente'],
            ['16', 'ZXC987', '16374589-4', '2023-04-20', '2023-04-22', 'Hubo un cierre temporal de la carretera por reparaciones'],
            ['17', 'VBN321', '17382946-7', '2023-04-25', '2023-04-27', 'Se realizó una parada técnica para mantenimiento preventivo'],
            ['18', 'RTY654', '14567890-1', '2023-05-01', '2023-05-03', 'El conductor tuvo que realizar una parada de descanso'],
            ['19', 'UIO987', '18987654-3', '2023-05-05', '2023-05-07', 'Se presentó una protesta que bloqueó temporalmente la ruta'],
            ['20', 'FGH123', '19654321-6', '2023-05-10', '2023-05-12', 'El vehículo tuvo problemas mecánicos y requirió asistencia'],
            ['21', 'JKL789', '18273946-2', '2023-05-15', '2023-05-17', 'Se reportaron condiciones climáticas favorables durante el viaje'],
            ['22', 'TYU654', '19087654-1', '2023-05-20', '2023-05-22', 'Hubo retraso en la entrega debido a un error en la dirección'],
            ['23', 'BNM987', '16784532-8', '2023-05-25', '2023-05-27', 'El vehículo fue escoltado por medidas de seguridad'],
            ['24', 'QWE321', '18456732-5', '2023-05-30', '2023-06-01', 'Se realizó una carga adicional durante el trayecto'],
            ['25', 'JKL987', '16987654-3', '2023-06-05', '2023-06-07', 'No se reportaron incidentes durante el viaje'],
            ['26', 'GHJ321', '18475392-1', '2023-06-10', '2023-06-12', 'El conductor tuvo que desviarse debido a un accidente en ruta'],
            ['27', 'BNM654', '19283746-5', '2023-06-15', '2023-06-17', 'Se presentaron demoras en el despacho de la carga'],
            ['28', 'TYU987', '18574963-2', '2023-06-20', '2023-06-22', 'El vehículo tuvo un problema con el sistema de refrigeración'],
            ['29', 'IOP321', '18394756-4', '2023-06-25', '2023-06-27', 'Se registraron obras de construcción en la ruta'],
            ['30', 'ZXC654', '19756439-1', '2023-06-30', '2023-07-02', 'El trayecto se completó sin incidentes']
          ]
        };
    }

    ngAfterViewInit(){
      $('#datatable-IR').DataTable({
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

      let table = $('#datatable-IR').DataTable();

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
