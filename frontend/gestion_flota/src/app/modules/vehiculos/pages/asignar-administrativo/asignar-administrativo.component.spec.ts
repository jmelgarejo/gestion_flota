import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AsignarAdministrativoComponent } from './asignar-administrativo.component';

describe('AsignarAdministrativoComponent', () => {
  let component: AsignarAdministrativoComponent;
  let fixture: ComponentFixture<AsignarAdministrativoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AsignarAdministrativoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AsignarAdministrativoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
