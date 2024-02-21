import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PbiTitleComponent } from './pbi-title.component';

describe('PbiTitleComponent', () => {
  let component: PbiTitleComponent;
  let fixture: ComponentFixture<PbiTitleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PbiTitleComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PbiTitleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
