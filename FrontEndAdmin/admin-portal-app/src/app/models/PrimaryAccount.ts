import { PrimaryTransaction } from './PrimaryTransaction';

export class PrimaryAccount {
    id: number;
    accountNumber: number;
    accountBalance: number;
    primaryTransactionList: PrimaryTransaction[];

    constructor() { }



    public get primaryId() {
        return this.id;
    }
    public set primaryId(_id) {
        this.id = _id;
    }

    public get primaryAccountNumber() {
        return this.accountNumber;
    }
    public set primaryAccountNumber(_accountNumber) {
        this.accountNumber = _accountNumber;
    }

    public get primaryAccountBalance() {
        return this.accountBalance;
    }
    public set primaryAccountBalance(_accountBalance) {
        this.accountBalance = _accountBalance;
    }
    public get accountPrimaryTransactionList() {
        return this.primaryTransactionList;
    }
    public set accountPrimaryTransactionList(_accountPrimaryTransactionList) {
        this.accountPrimaryTransactionList = _accountPrimaryTransactionList;
    }


   


}