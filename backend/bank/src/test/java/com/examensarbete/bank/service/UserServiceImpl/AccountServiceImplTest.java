package com.examensarbete.bank.service.UserServiceImpl;

import com.examensarbete.bank.dao.PrimaryAccountDao;
import com.examensarbete.bank.domain.PrimaryAccount;
import com.examensarbete.bank.domain.User;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AccountServiceImplTest {
    static User user1;
    static PrimaryAccount primaryAccount;
    static PrimaryAccount primaryAccountToWithdraw;
    @InjectMocks
    public AccountServiceImpl accountService;
    private int nextAccountNumber = 11223145;
    @Mock
    private PrimaryAccountDao primaryAccountDao;

    @BeforeAll
    static void setUpInstances(){
        user1 =new User();
         primaryAccount = new PrimaryAccount();
        primaryAccountToWithdraw=new PrimaryAccount();
        primaryAccount.setAccountBalance(new BigDecimal(0.0));
        user1.setUsername("John");


    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);

    }

    @DisplayName("test of creating primary account")
    @Test
    void createPrimaryAccount() {

        assertEquals(0.0, primaryAccount.getAccountBalance().doubleValue());
        primaryAccount.setAccountNumber(accountGen());
        assertNotNull(primaryAccount.getAccountNumber());
        when(primaryAccountDao.save(primaryAccount)).thenReturn(primaryAccount);
        PrimaryAccount primaryAccountDB = primaryAccountDao.save(primaryAccount);
        assertEquals(primaryAccount.getAccountNumber(), primaryAccountDB.getAccountNumber());

    }

    @Test
    void createSavingsAccount() {

    }
    @DisplayName("test of deposit to primary account")
    @Test
    void deposit() {
      double amountToDeposit=350.0;
      primaryAccount.setAccountBalance(primaryAccount.getAccountBalance().add(new BigDecimal(amountToDeposit)));
      assertEquals(350.0,primaryAccount.getAccountBalance().doubleValue());
    }

    @Test
    void withdraw() {
        double amountToWithDraw=250.0;
        primaryAccountToWithdraw.setAccountBalance(new BigDecimal(1000.0));
        primaryAccountToWithdraw.setAccountBalance(primaryAccountToWithdraw.getAccountBalance().subtract(new BigDecimal(amountToWithDraw)));
        System.out.println(primaryAccountToWithdraw.getAccountBalance().doubleValue());
        assertEquals(750.0,primaryAccountToWithdraw.getAccountBalance().doubleValue());
    }

    private int accountGen() {
        return ++nextAccountNumber;
    }
}