package com.microservice.accountsservice.service;

import com.microservice.accountsservice.dao.Account;
import com.microservice.accountsservice.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepo;

    public Account getAccountById(Long accountNumber) {
        Account account = new Account();
        account =accountRepo.findByAccountNumber(accountNumber);
        return account;
    }

    public List<Account> getAllAccounts() {
        return accountRepo.findAll();
    }
}