import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {RouterModule} from '@angular/router'

import { AppComponent } from './app.component';
import { NewsComponent } from './news/news.component';
import { NewsDetailsComponent } from './news-details/news-details.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { from } from 'rxjs';

@NgModule({
  declarations: [
    AppComponent,
    NewsComponent,
    NewsDetailsComponent,
    HeaderComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,RouterModule.forRoot([
      {path : '',component:HomeComponent},
      {path : 'news',component : NewsComponent}
    

    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
