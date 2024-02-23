import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ServerRequestComponent } from './server-request/server-request.component';
import { HttpClientModule } from '@angular/common/http';
import { ServerRequestServiceComponent } from './server-request-service/server-request-service.component';

@NgModule({
  declarations: [AppComponent, ServerRequestComponent, ServerRequestServiceComponent],
  imports: [BrowserModule, HttpClientModule],
  providers: [AppComponent, ServerRequestComponent],
  bootstrap: [AppComponent],
})
export class AppModule {}
