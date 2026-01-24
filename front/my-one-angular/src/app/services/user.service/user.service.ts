import { Injectable } from '@angular/core';
// import { HttpClient } from '@angular/common/http';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root',
})
export class UserService {

  constructor(private http: HttpClient){}
  
  // fucion of get users 
  getUsers(){
     return this.http.get<any[]>('users.json'); 
    //  return this.http.get<any[]>('https://jsonplaceholder.typicode.com/users');
  }
}
