import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AnalyseProjetComponent } from './analyse-projet.component';

describe('AnalyseProjetComponent', () => {
  let component: AnalyseProjetComponent;
  let fixture: ComponentFixture<AnalyseProjetComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AnalyseProjetComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AnalyseProjetComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
