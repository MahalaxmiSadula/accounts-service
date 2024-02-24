package com.microservice.accountsservice.controller;

import com.microservice.accountsservice.dao.Account;
import com.microservice.accountsservice.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/")
    public String test() {
        log.info("welcome account");
        return "success";
    }

    @GetMapping("/{accountNumber}")
    public ResponseEntity<Account> getAccountById(@PathVariable Long accountNumber) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        Account account = accountService.getAccountById(accountNumber);
        if (account == null) {
            return ResponseEntity.notFound().build();
        }
        return new ResponseEntity<>(account, headers, HttpStatus.OK);
    }

//    @GetMapping("/{accountNumber}")
//    public Account getAccountById(@PathVariable Long accountNumber) {
//        Account account = accountService.getAccountById(accountNumber);
//
////        if (account == null) {
////            return ResponseEntity.notFound().build();
////        }
////        return ResponseEntity.ok(account);
//        return account;
//    }

    @GetMapping("/api/accounts")
    public ResponseEntity<List<Account>> getAllAccounts() {
        List<Account> accounts = accountService.getAllAccounts();
        return ResponseEntity.ok(accounts);
    }
}