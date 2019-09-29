import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule} from '@angular/router';
import {FormsModule} from '@angular/forms'

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';

import { PageNotFoundComponent } from './page-not-found/page-not-found.component';

import { HomeComponent } from './home/home.component';
import { from } from 'rxjs';
import { HttpClientModule } from '@angular/common/http';
import { LoginserviceService } from './loginservice.service';
import { NewsservicesService } from './newsservices.service';

import { TaskmanagerComponent } from './taskmanager/taskmanager.component';
import { UsersComponent } from './users/users.component';
import { TaskComponent } from './task/task.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    PageNotFoundComponent,
    HomeComponent,
    TaskmanagerComponent,
    UsersComponent,
    TaskComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path:'',component:HomeComponent},
      {path:'users',component:UsersComponent},
      {path:'taskmanager',component:TaskmanagerComponent},
      {path:'**',component:PageNotFoundComponent},
      ]),
  ],
  providers: [NewsservicesService],
  bootstrap: [AppComponent]
})
export class AppModule { }
