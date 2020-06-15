import { Component } from '@angular/core';
import{FormGroup,FormControl,FormBuilder,NgForm,Validators} from '@angular/forms'
//import { EmployeePojo } from './employee-pojo';
import { EmployeeService } from './employee.service';
import { EmployeePojo } from './employee-pojo';
import { ResourceLoader } from '@angular/compiler';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
title = 'Employedetail';
singUpForm:FormGroup;
ID:string="";
Name:string="";
Salary:string="";
Department:string="";
empdata:String;
employedata:EmployeePojo=new EmployeePojo("","","","");

message:any;
emp:any;
constructor(private formbuilder:FormBuilder,private employe:EmployeeService) { 
  this.singUpForm=formbuilder.group({ID:new FormControl(),Name:new FormControl(),Salary:new FormControl(),Department:new FormControl()});      
}
ngOnInit(){
 
}

onFormSubmit(){

  //let employedata=this.singUpForm.value;
  
  this.employedata =this.singUpForm.value;
  let resp=this.employe.PostData(this.employedata);

  resp.subscribe((data)=>{
    this.message=data
  this.singUpForm.reset();
  location.reload();
  });
  
}
getEmploy(){
  let resp=this.employe.getEmployeedetails(this.empdata);
  resp.subscribe((data)=>this.emp=data)
}
}