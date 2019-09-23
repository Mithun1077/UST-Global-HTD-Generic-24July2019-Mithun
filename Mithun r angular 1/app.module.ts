import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule} from '@angular/router'
import {FormsModule} from '@angular/forms'

import { AppComponent } from './app.component';
import { TaskComponent } from './task/task.component';
import { TaskManagerComponent } from './task-manager/task-manager.component';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { from } from 'rxjs';
import { TaskserviceService } from './taskservice.service';

@NgModule({
  declarations: [
    AppComponent,
    TaskComponent,
    TaskManagerComponent,
    HomeComponent,
    HeaderComponent
  ],
  imports: [
    BrowserModule,FormsModule,
    RouterModule.forRoot([
      {path : '',component : HomeComponent},
      {path : 'task',component : TaskComponent},
      {path : 'taskmanager',component : TaskManagerComponent},
  
    ])
  ],
  providers: [TaskserviceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
