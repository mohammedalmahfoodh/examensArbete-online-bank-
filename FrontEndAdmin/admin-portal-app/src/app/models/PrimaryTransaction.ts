import { PrimaryAccount } from './PrimaryAccount';

export class PrimaryTransaction {
    id: number;
    date: Date;
    description: string;
    type: string;
    status: string;
    amount: number;
    availableBalance: number;
    primaryAccount: PrimaryAccount;


    constructor() { }
    public get primaryId() {
        return this.id;
    }
    public set primaryId(_id) {
        this.id = _id;
    }
    public get primaryDate() {
        return this.date;
    }
    public set primaryDate(_date) {
        this.date = _date;
    }

    public get primaryDescription() {
        return this.description;
    }
    public set primaryDescription(_description) {
        this.description = _description;
    }
    public get primaryType() {
        return this.type;
    }
    public set primaryType(_primaryType) {
        this.type = _primaryType;
    }


    public get primaryStatus() {
        return this.status;
    }
    public set primaryStatus(_primaryStatus) {
        this.status = _primaryStatus;
    }

    public get primaryAmount() {
        return this.amount;
    }
    public set primaryAmount(_amount) {
        this.amount = _amount;
    }

    public get primaryAvailableBalance() {
        return this.availableBalance;
    }
    public set primaryAvailableBalance(_availableBalance) {
        this.availableBalance = _availableBalance;
    }
    public get transactionprimaryAccount() {
        return this.primaryAccount;
    }
    public set transactionprimaryAccount(_primaryAccount) {
        this.primaryAccount = _primaryAccount;
    }


}