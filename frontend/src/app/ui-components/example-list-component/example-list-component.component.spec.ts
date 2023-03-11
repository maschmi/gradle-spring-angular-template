import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ExampleListComponentComponent } from './example-list-component.component';

describe('ExampleComponentComponent', () => {
  let component: ExampleListComponentComponent;
  let fixture: ComponentFixture<ExampleListComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ExampleListComponentComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ExampleListComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
