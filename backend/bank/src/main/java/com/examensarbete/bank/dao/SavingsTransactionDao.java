package com.examensarbete.bank.dao;

import com.examensarbete.bank.domain.SavingsTransaction;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {

    List<SavingsTransaction> findAll();
}
