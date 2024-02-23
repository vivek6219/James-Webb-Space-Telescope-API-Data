import { Component, Injectable, OnInit } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { ServerRequestServiceComponent } from '../server-request-service/server-request-service.component';

@Component({
  selector: 'app-server-request',
  templateUrl: './server-request.component.html',
  styleUrls: ['./server-request.component.css'],
})
@Injectable()
export class ServerRequestComponent implements OnInit {
  imgData: any;
  imageUrls: string[] = [];
  currentIndex: number = 0;
  imagesPerPage: number = 10;
  constructor(
    private serverRequestServiceComponent: ServerRequestServiceComponent
  ) {}

  ngOnInit() {
    // This method will be called when the component is initialized
    // this.getData();
    this.fetchImageUrlsSlow();
  }

  getData() {
    this.serverRequestServiceComponent.getData().subscribe(
      (data) => {
        this.imgData = data;
        console.log('Data:', data);
      },
      (error) => {
        console.error('Error Fetching data', error);
      }
    );
  }

  fetchImageUrlsSlow() {
    this.serverRequestServiceComponent.fetchSlow().subscribe(
      (data) => {
        this.imageUrls = data;
      },
      (error) => {
        console.error('Error fetching image urls', error);
      }
    );
  }

  displayNextImages(): void {
    this.currentIndex += this.imagesPerPage;
  }

  getDisplayedImages() {
    return this.imageUrls.slice(
      this.currentIndex,
      this.currentIndex + this.imagesPerPage
    );
  }
}
