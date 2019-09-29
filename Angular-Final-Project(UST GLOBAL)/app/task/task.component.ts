import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-task',
  templateUrl: './task.component.html',
  styleUrls: ['./task.component.css']
})
export class TaskComponent implements OnInit {
  @Input() Detailss:any[]=[];
     

  constructor() { 

  }
  

  ngOnInit() {
  }
  delete(i)
  {
    this.Detailss.splice(i,1,);
  }

}
