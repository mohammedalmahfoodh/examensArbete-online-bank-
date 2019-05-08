import { SavingsTransaction } from './../models/SavingsTransaction';
import { PrimaryTransaction } from './../models/PrimaryTransaction';
import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { User } from '../models/user';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor (private http: HttpClient){}

 /* getUsers():Observable<HttpResponse<User[]>> {
    let url = "http://localhost:8080/api/user/all";
    return this.http.get<User[]>(url, { withCredentials: true ,observe: 'response',responseType: 'text' as 'json'});
  }*/
  getUsers():Observable<HttpResponse<User[]>> {
    let url = "http://localhost:8080/api/user/all";
    return this.http.get<User[]>(url, { withCredentials: true,responseType: 'text' as 'json',observe: 'response' });
  }


   getPrimaryTransactionList(username: string):Observable<HttpResponse<PrimaryTransaction[]>> {
    let url = "http://localhost:8080/api/user/primary/transaction?username="+username;
   return this.http.get<PrimaryTransaction[]>(url,{ withCredentials: true,responseType: 'text' as 'json',observe: 'response' } );
  }


   

  /* getSavingsTransactionList(username: string) {
     let url = "http://localhost:8080/api/user/savings/transaction?username="+username;
    return this.http.get(url, { withCredentials: true });
   }*/
   
   getSavingsTransactionList(username: string):Observable<HttpResponse<SavingsTransaction[]>> {
    let url = "http://localhost:8080/api/user/savings/transaction?username="+username;
   return this.http.get<SavingsTransaction[]>(url,{ withCredentials: true,responseType: 'text' as 'json',observe: 'response' } );
  }



   enableUser (username: string) {
     let url = "http://localhost:8080/api/user/"+username+"/enable";
     return this.http.get(url, { withCredentials: true });
   }

   disableUser (username: string) {
     let url = "http://localhost:8080/api/user/"+username+"/disable";
     return this.http.get(url, { withCredentials: true });
   }
}
