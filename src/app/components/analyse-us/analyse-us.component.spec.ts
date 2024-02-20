import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AnalyseUsComponent } from './analyse-us.component';

describe('AnalyseUsComponent', () => {
  let component: AnalyseUsComponent;
  let fixture: ComponentFixture<AnalyseUsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AnalyseUsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AnalyseUsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
