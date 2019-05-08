package com.examensarbete.bank.dao;

import com.examensarbete.bank.domain.PrimaryAccount;
import org.springframework.data.repository.CrudRepository;

public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount,Long> {
    PrimaryAccount findByAccountNumber (int accountNumber);
}
