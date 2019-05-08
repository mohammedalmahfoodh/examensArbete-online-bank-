import { environment as env} from './../../../environments/environment';
import { Component, OnInit, OnDestroy } from '@angular/core';
import { UserService } from 'src/app/services/user.service';
import { Router } from '@angular/router';
import { User } from 'src/app/models/user';
import { error } from '@angular/compiler/src/util';
import { Observable } from 'rxjs';
import { HttpResponse } from '@angular/common/http';
import { subscribeOn } from 'rxjs/operators';

@Component({
  selector: 'app-user-account',
  templateUrl: './user-account.component.html',
  styleUrls: ['./user-account.component.css']
})
export class UserAccountComponent implements OnInit,OnDestroy {
 subscription:Observable<HttpResponse<User[]>>;
  userList: any[];
  notAllowed:boolean=false;
  public env=env;
	constructor(private userService: UserService, private router: Router) {
		
	}

	getUsers() {
		this.subscription=this.userService.getUsers();
		
		 this.subscription.subscribe(
			res => {
				this.userList = JSON.parse(JSON.parse(JSON.stringify(res.body)));
				
				console.log(res.body)			
				
      		},
			  error =>{ console.log(error);
			     this.notAllowed=true;
			} 
			  

		)
	}

	onSelectPrimary(username: string) {
    	this.router.navigate(['/primaryTransaction', username]);
  	}	

  	onSelectSavings(username: string) {
    	this.router.navigate(['/savingsTransaction', username]);
  	}	

  	enableUser(username: string) {
  		this.userService.enableUser(username).subscribe();
  		location.reload();
  	}

  	disableUser(username: string) {
  		this.userService.disableUser(username).subscribe();
  		location.reload();
  	}


  ngOnInit() {
	this.getUsers();
  }
  ngOnDestroy() {
	 this.subscription.subscribe().unsubscribe();
}

}
