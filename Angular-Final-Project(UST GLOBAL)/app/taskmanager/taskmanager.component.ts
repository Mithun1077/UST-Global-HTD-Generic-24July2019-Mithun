import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-taskmanager',
  templateUrl: './taskmanager.component.html',
  styleUrls: ['./taskmanager.component.css']
})
export class TaskmanagerComponent implements OnInit {
  dat: any[]=[];
 

  constructor() { }
  printValue(loginform : NgForm)
  {
   
    this.dat.push(loginform.value)
   
     loginform.reset();

  }
  // send(loginform)
  // {
   
  //   this.new= loginform.value;
  // }
 

  ngOnInit() {
  }

}
