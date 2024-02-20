import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OneAnalyseComponent } from './one-analyse.component';

describe('OneAnalyseComponent', () => {
  let component: OneAnalyseComponent;
  let fixture: ComponentFixture<OneAnalyseComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ OneAnalyseComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(OneAnalyseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
