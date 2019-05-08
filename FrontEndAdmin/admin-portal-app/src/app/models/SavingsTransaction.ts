import { SavingsAccount } from './SavingsAccount';

export class SavingsTransaction {
    id: number;
    date: Date;
    description: string;
    type: string;
    status: string;
    amount: number;
    availableBalance: number;
    savingsAccount: SavingsAccount;


    constructor() { }
    public get savingsId() {
        return this.id;
    }
    public set savingsId(_id) {
        this.id = _id;
    }
    public get savingsDate() {
        return this.date;
    }
    public set primaryDate(_date) {
        this.date = _date;
    }

    public get savingsDescription() {
        return this.description;
    }
    public set savingsDescription(_description) {
        this.description = _description;
    }
    public get savingsType() {
        return this.type;
    }
    public set savingsType(_savingsType) {
        this.type = _savingsType;
    }


    public get savingsStatus() {
        return this.status;
    }
    public set savingsStatus(_savingsStatus) {
        this.status = _savingsStatus;
    }

    public get savingsAmount() {
        return this.amount;
    }
    public set savingsyAmount(_amount) {
        this.amount = _amount;
    }

    public get savingsAvailableBalance() {
        return this.availableBalance;
    }
    public set savingsAvailableBalance(_availableBalance) {
        this.availableBalance = _availableBalance;
    }
    public get SavingsTransactionAccount() {
        return this.savingsAccount;
    }
    public set SavingsTransactionAccount(_savingsAccount) {
        this.savingsAccount = _savingsAccount;
    }


}