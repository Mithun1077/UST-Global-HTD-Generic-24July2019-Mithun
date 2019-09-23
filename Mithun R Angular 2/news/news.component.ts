import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.css']
})
export class NewsComponent implements OnInit {
  new:any[]=[];

  constructor() { }
  cars=[
    {
    carname : "mithun",
    carurl : "https://cdn.pixabay.com/photo/2016/04/01/12/16/car-1300629__340.png",
    cardetails : 'this is a car'
  },
  {
    carname : "nithin",
    carurl : "https://cdn.pixabay.com/photo/2012/11/02/13/02/ford-63930__340.jpg",
    cardetails : 'It has a four wheel'
  },
  {
    carname : "manu",
    carurl : "https://cdn.pixabay.com/photo/2015/09/02/12/25/bmw-918408__340.jpg",
    cardetails : 'It has only one driver'
  }
]
sendData(n)
{
  this.new = n;
}

  ngOnInit() {
  }

}
