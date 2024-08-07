import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SamComponentComponent } from './sam-component.component';

describe('SamComponentComponent', () => {
  let component: SamComponentComponent;
  let fixture: ComponentFixture<SamComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [SamComponentComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SamComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
