import { TestBed } from '@angular/core/testing';

import { PokerserviceService } from './pokerservice.service';

describe('PokerserviceService', () => {
  let service: PokerserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PokerserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
