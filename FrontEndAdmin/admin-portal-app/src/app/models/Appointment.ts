import { User } from './user';

export class Appointment {
    id: number;
    date: Date;
    location: string;
    description: string;
    confirmed:boolean;
    user:User;
   

    constructor() { }



    public get primaryId() {
        return this.id;
    }
    public set primaryId(_id) {
        this.id = _id;
    }

    public get appointmentdate() {
        return this.date;
    }
    public set appointmentdate(_date) {
        this.date = _date;
    }

    public get appointmentlocation() {
        return this.location;
    }
    public set appointmentlocation(_location) {
        this.location = _location;
    }
    public get appointmentdescription() {
        return this.description;
    }
    public set appointmentdescription(_description) {
         this.description=_description;
    }
    public get appointmentconfirmed() {
        return this.confirmed;
    }
    public set appointmentconfirmed(_confirmed) {
        this.confirmed = _confirmed;
    }
    public set appointmentUser(_user) {
        this.user = _user;
    }
    public get appointmentUser() {
        return this.user;
    }

}