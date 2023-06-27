import { TestBed } from '@angular/core/testing';

import { AsignarAdministrativosService } from './asignar-administrativos.service';

describe('AsignarAdministrativosService', () => {
  let service: AsignarAdministrativosService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AsignarAdministrativosService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
