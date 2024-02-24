package com.microservice.accountsservice.repository;

import com.microservice.accountsservice.dao.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    public Account findByAccountNumber(Long accountNumber);
}
