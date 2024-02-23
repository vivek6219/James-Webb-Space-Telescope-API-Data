import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ServerRequestServiceComponent } from './server-request-service.component';

describe('ServerRequestServiceComponent', () => {
  let component: ServerRequestServiceComponent;
  let fixture: ComponentFixture<ServerRequestServiceComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ServerRequestServiceComponent]
    });
    fixture = TestBed.createComponent(ServerRequestServiceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
