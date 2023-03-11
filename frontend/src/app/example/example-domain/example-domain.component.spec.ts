import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ExampleDomainComponent } from './example-domain.component';

describe('ExampleDomainComponent', () => {
  let component: ExampleDomainComponent;
  let fixture: ComponentFixture<ExampleDomainComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ExampleDomainComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ExampleDomainComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
