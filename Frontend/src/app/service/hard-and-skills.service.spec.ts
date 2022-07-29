import { TestBed } from '@angular/core/testing';

import { HardAndSkillsService } from './hard-and-skills.service';

describe('HardAndSkillsService', () => {
  let service: HardAndSkillsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(HardAndSkillsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
