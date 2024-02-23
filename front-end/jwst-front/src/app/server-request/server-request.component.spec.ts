import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ServerRequestComponent } from './server-request.component';

describe('ServerRequestComponent', () => {
  let component: ServerRequestComponent;
  let fixture: ComponentFixture<ServerRequestComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ServerRequestComponent]
    });
    fixture = TestBed.createComponent(ServerRequestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
