import { TestBed } from '@angular/core/testing';

import { VehiculosDisponiblesService } from './vehiculos-disponibles.service';

describe('VehiculosDisponiblesService', () => {
  let service: VehiculosDisponiblesService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(VehiculosDisponiblesService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
