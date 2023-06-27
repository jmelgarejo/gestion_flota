import { TestBed } from '@angular/core/testing';

import { SolicitarVehiculoService } from './solicitar-vehiculo.service';

describe('SolicitarVehiculoService', () => {
  let service: SolicitarVehiculoService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SolicitarVehiculoService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
