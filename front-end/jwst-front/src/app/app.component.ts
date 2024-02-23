import { Component, Injectable } from '@angular/core';
import { ServerRequestComponent } from './server-request/server-request.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
@Injectable()
export class AppComponent {
  title = 'jwst-front';

  locationList: any;

  constructor() {}

  // ngOnIt() {
  //   this.fetchData();
  //   console.log('Entering App.componenet.ts');
  //   // this.imageList.getData().subscribe((result) => {
  //   //   this.locationList = this.imageList;
  //   //   console.log(this.locationList);
  //   //   console.log(this.imageList);
  //   // });
  // }

  // fetchData() {
  //   this.imageList.getData().subscribe((data) => {
  //     console.log('in fetchData');
  //     console.log(data);
  //   });
  // }

  // ngOnIt() {
  //   console.log('SHOW MNE SOMETHING');
  //   var blob = new Blob([this.locationList], { type: 'image/jpeg' });
  //   var url = window.URL.createObjectURL(blob);
  //   window.open(url);
  // }
}
