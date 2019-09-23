import { Component, OnInit } from '@angular/core';
import { TaskserviceService } from '../taskservice.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-task',
  templateUrl: './task.component.html',
  styleUrls: ['./task.component.css']
})
export class TaskComponent implements OnInit {
  

  constructor(private send : TaskserviceService ) { }
  sendata(loginform : NgForm)
  {
   this.send.dat.push(loginform.value);
   loginform.reset();
   
    
    
  }


  ngOnInit() {
  }

}
