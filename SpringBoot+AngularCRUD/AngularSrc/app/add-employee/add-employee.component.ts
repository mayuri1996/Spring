import { Component, OnInit } from '@angular/core';
import { MyServiceService } from '../my-service.service';
import { Details } from '../details';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent implements OnInit {
 //user:Details = new Details("","","","","");
 submitForm:FormGroup;
 get f(){return this.submitForm.controls;}

  constructor(
    private myService:MyServiceService,
    private formbuilder:FormBuilder
  ) { 
     this.submitForm = this.formbuilder.group(
       {
         'id':['',[Validators.required,Validators.pattern("[0-9]*")]],
         'name':['',[Validators.required]]
       }
     )

  }

  ngOnInit() {
  }
  // setDetails(){
  //   this.myService.create(this.user).subscribe(
  //     data=>{alert("Employee Created Successfully")
  //   });
  // }

  onSubmit(formdata:Details){
    this.myService.create(formdata).subscribe(
      data=>{alert("Employee Created Successfully")
    });
  }


}
