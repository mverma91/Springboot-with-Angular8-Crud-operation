import { Injectable } from '@angular/core';
import { HttpClient,HttpHandler,HttpHeaders } from '@angular/common/http';
import { EmployeePojo } from './employee-pojo';
import { Observable } from 'rxjs';
import { analyzeAndValidateNgModules } from '@angular/compiler';
@Injectable()
export class EmployeeService {
  constructor(private http: HttpClient){}
  empoyeurl="http://localhost:8070/employeeDetail/saveemployees"
  getempoyeurl="http://localhost:8070/employeeDetail/gateemployees/"
  PostData(employe:EmployeePojo):Observable<EmployeePojo> {
    //:Observable<EmployeePojo>
let httpheaders=new HttpHeaders({'Content-Type':'application/json'});

let options={
  headers:httpheaders
};

return this.http.post<EmployeePojo>(this.empoyeurl,employe,{responseType:'text' as 'json'});


  }
  getEmployeedetails(empdata:String):Observable<EmployeePojo[]>{
    let httpheaders=new HttpHeaders({'Content-Type':'application/json'});
    let options={
      headers:httpheaders
    };
    
    return this.http.get<EmployeePojo[]>(this.getempoyeurl+empdata);

  }
  
}
