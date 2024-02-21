import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PokerPlanningComponent } from './poker-planning.component';

describe('PokerPlanningComponent', () => {
  let component: PokerPlanningComponent;
  let fixture: ComponentFixture<PokerPlanningComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PokerPlanningComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PokerPlanningComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
