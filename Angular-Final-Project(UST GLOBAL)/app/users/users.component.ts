import { Component, OnInit } from '@angular/core';
import { NewsservicesService } from '../newsservices.service';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {

  uses:any[]=[];
  mit:any[]=[];
  constructor(private data :NewsservicesService) { }

  ngOnInit() {
   this.data.getApi()
   .subscribe(data =>{
this.uses = data;
console.log(this.uses)
    },err=>{
      console.log(err)
    })

//     this.data.getApi()
//     .subscribe(data =>{
//  this.mit = data.address;
//  console.log(this.mit)
//      },err=>{
//        console.log(err)
//      })

  }

}
