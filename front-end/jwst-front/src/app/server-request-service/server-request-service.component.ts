import { HttpClient } from '@angular/common/http';
import { Component, Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-server-request-service',
  templateUrl: './server-request-service.component.html',
  styleUrls: ['./server-request-service.component.css'],
})
@Injectable({
  providedIn: 'root',
})
export class ServerRequestServiceComponent {
  url: string = 'http://localhost:8082/images/';

  constructor(private http: HttpClient) {}

  getData(): Observable<any> {
    console.log('STUFF' + this.http.get<any>(this.url));
    return this.http.get<any>(this.url);

    // return this.http.get<any>(this.url, {});
  }
  fetchSlow() {
    return this.http.get<any>(this.url);
  }
}
