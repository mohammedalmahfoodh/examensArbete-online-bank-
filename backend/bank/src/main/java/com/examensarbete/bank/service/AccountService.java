package com.examensarbete.bank.service;

import com.examensarbete.bank.domain.PrimaryAccount;
import com.examensarbete.bank.domain.SavingsAccount;

import java.security.Principal;

public interface AccountService {

    PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();
    void deposit(String accountType, double amount, Principal principal);
    void withdraw(String accountType, double amount, Principal principal);




}
