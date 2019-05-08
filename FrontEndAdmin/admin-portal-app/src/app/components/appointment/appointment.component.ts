import { Appointment } from './../../models/Appointment';
import { AppointmentService } from './../../services/appointment.service';
import { Component, OnInit, OnDestroy } from '@angular/core';
import { HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-appointment',
  templateUrl: './appointment.component.html',
  styleUrls: ['./appointment.component.css']
})
export class AppointmentComponent implements OnInit,OnDestroy {
  subscription:Observable<HttpResponse<Appointment[]>>;
  ngOnDestroy(): void {
    this.subscription.subscribe().unsubscribe();
  }

  appointmentList: any[];

	constructor(private appointmentService: AppointmentService) {
		this.getAppointmentList();
	}

	getAppointmentList() {
    this.subscription=this.appointmentService.getAppointmentList();
		this.subscription.subscribe(
			res => {
            this.appointmentList = JSON.parse(JSON.parse(JSON.stringify(res.body)));
            console.log(this.appointmentList);
      		},
      		error => console.log(error)
		)
	}	

	confirmAppointment(id: number) {
  		this.appointmentService.confirmAppointment(id).subscribe();
  		location.reload();
  	}

  ngOnInit() {
  }

}
