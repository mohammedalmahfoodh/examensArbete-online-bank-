import { Appointment } from './../models/Appointment';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { HttpResponse } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class AppointmentService {

  constructor (private http: HttpClient){}


  getAppointmentList():Observable<HttpResponse<Appointment[]>> {
    let url = "http://localhost:8080/api/appointment/all";
    return this.http.get<Appointment[]>(url, { withCredentials: true,responseType: 'text' as 'json',observe: 'response' });
  }
  confirmAppointment(id: number) {
    let url = "http://localhost:8080/api/appointment/"+id+"/confirm";
    return this.http.get(url, { withCredentials: true });
  }

}
