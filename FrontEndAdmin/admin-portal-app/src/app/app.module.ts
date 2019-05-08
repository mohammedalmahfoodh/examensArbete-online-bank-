import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule }   from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { NavbarComponent } from './components/navbar/navbar.component';
import { LoginComponent } from './components/login/login.component';
import {LoginServiceService} from './services/login-service.service';
import { UserAccountComponent } from './components/user-account/user-account.component';
import { PrimaryTransactionComponent } from './components/primary-transaction/primary-transaction.component';
import { SavingsTransactionComponent } from './components/savings-transaction/savings-transaction.component';
import { routing }  from './app.routing';
import { UserService } from './services/user.service';
import { AppointmentComponent } from './components/appointment/appointment.component';
import { AppointmentService } from './services/appointment.service';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    LoginComponent,
    UserAccountComponent,
    PrimaryTransactionComponent,
    SavingsTransactionComponent,
    AppointmentComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,HttpClientModule,
    AppRoutingModule,
    routing
  ],
  providers: [
    LoginServiceService,UserService,AppointmentService

  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
