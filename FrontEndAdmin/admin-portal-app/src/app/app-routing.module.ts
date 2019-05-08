import { PrimaryTransactionComponent } from './components/primary-transaction/primary-transaction.component';
import { LoginComponent } from './components/login/login.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserAccountComponent } from './components/user-account/user-account.component';
import { SavingsTransactionComponent } from './components/savings-transaction/savings-transaction.component';
import { AppointmentComponent } from './components/appointment/appointment.component';

const routes: Routes = [{
  path: '',
  redirectTo: '/login',
  pathMatch: 'full'
},
{
  path: 'login',
  component: LoginComponent
},
{
  path: 'userAccount',
  component: UserAccountComponent
},
{
  path: 'primaryTransaction/:username',
  component: PrimaryTransactionComponent
},
{
  path: 'savingsTransaction/:username',
  component: SavingsTransactionComponent
},
{
  path: 'appointment',
  component: AppointmentComponent
}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
