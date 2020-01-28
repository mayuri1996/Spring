import { Component, OnInit } from '@angular/core';
import { MyServiceService } from '../my-service.service';
import { Details } from '../details';

@Component({
  selector: 'app-view-employee',
  templateUrl: './view-employee.component.html',
  styleUrls: ['./view-employee.component.css']
})
export class ViewEmployeeComponent implements OnInit {
  list: Details;
  constructor(
    private myService:MyServiceService
  ){}

  ngOnInit(){
    this.myService.getList().subscribe(
      data=>{this.list = data;}
    )
  }

  deleteRecord(user:Details){
    console.log(user);
    
    this.myService.delete(user).subscribe(
      data=>{this.list=this.list.filter(u=>u!==user)}
    )
  }
}
