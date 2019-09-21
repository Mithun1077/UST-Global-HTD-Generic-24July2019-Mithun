import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';

import{RouterModule} from '@angular/router';

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { LloginComponent } from './llogin/llogin.component';
import { DatabaseComponent } from './database/database.component';
import { NewsapiComponent } from './newsapi/newsapi.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LloginComponent,
    DatabaseComponent,
    NewsapiComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {path:'',component:HomeComponent},
      {path:'login',component:LloginComponent},
      {path:'database',component:DatabaseComponent},
      {path:'newsapi',component:NewsapiComponent},
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
