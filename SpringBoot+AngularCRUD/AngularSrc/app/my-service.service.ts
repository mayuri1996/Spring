import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { from, Observable } from 'rxjs';
import { Details } from './details';

@Injectable({
  providedIn: 'root'
})
export class MyServiceService {

  constructor(
    private httpclient :HttpClient
  ) { }

  private url = "http://localhost:8080/api/";
  
  getList()
  {
    return this.httpclient.get<Details>(this.url);
  }

  delete(user){
    return this.httpclient.delete<Details>(this.url+"/"+user.id);
  }

  create(user){
    return this.httpclient.post<Details>(this.url,user);
  }

  update(user){
    return this.httpclient.put<Details>(this.url+"/"+user.id,user);
  }

}
