import { Appointment } from './Appointment';
export  class User{
    userId:string;
    username:string;
    password:string;
    firstName:string;
    lastName:string;
    email:string;
    phone:string;
    enabled:boolean;   
    appointmentList:Appointment[];

   
     constructor(){}
     public get userName(){
        return this.username;
    }
    public set userName(_username){
     this.username=_username;
    }
    public get userPassword(){
        return this.password;
    }
    public set userPassword(_password){
     this.username=_password;
    }

    public get userlastName(){
        return this.lastName;
    }
    public set userlastName(_lastName){
        this.lastName=_lastName;
       }
       public get userFirstName(){
           return this.firstName;
       }
       public set userFirstName(_firstName){
        this.username=_firstName;
       }


     public get userUserId(){
         return this.userId;
     }
     public set userUserId(_userId){
      this.userId=_userId;
     }

     public get useremail(){
        return this.userId;
    }
    public set useremail(_email){
     this.userId=_email;
    }

    public get userPhone(){
        return this.userId;
    }
    public set userPhone(_phone){
     this.userId=_phone;
    }
    public get userEnabled(){
        return this.userId;
    }
    public set userEnabled(_enabled){
     this.userId=_enabled;
    }
    public get userappointmentList(){
        return this.appointmentList;
    }
    public set userappointmentList(_appointmentList){
     this.appointmentList=_appointmentList;
    }
   
}