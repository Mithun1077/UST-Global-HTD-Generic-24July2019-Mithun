import { Component, OnInit } from '@angular/core';
import { TaskserviceService } from '../taskservice.service';

@Component({
  selector: 'app-task-manager',
  templateUrl: './task-manager.component.html',
  styleUrls: ['./task-manager.component.css']
})
export class TaskManagerComponent implements OnInit {
arr:any[]=[];

  constructor(private sent : TaskserviceService) {
   
   }

  ngOnInit() {
    
    this.arr = this.sent.dat;
   
    console.log(this.arr);
  }
delete(i)
{
  this.arr.splice(i,1,);
}
update(i)
{
  prompt('index')
}
}
