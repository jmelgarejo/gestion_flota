import { TestBed } from '@angular/core/testing';

import { RegistrarSalidasService } from './registrar-salidas.service';

describe('RegistrarSalidasService', () => {
  let service: RegistrarSalidasService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(RegistrarSalidasService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
