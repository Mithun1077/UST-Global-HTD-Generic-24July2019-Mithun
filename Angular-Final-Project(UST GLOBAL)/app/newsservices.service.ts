import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class NewsservicesService {

  constructor(private http : HttpClient) { }
  getApi()
  {
    return  this.http.get<any>('https://jsonplaceholder.typicode.com/users')
  }
}
