import { Injectable } from '@angular/core';
import { User } from 'src/User';
 
import { HttpClient, HttpParams, HttpHeaders } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http:HttpClient) { }

  getUsers():any{
    return this.http.get("http://localhost:8081/users");
  }

  createUser(user:User):void{
    
  }

  ValidateUser(user:User): boolean {


    return false;
  }
}
