package com.microservice.accountsservice.dao;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.BigInteger;
@Entity
@Getter
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountNumber;

    @Column(nullable = false)
    private String transactionDetails;

    @Column(nullable = false, precision = 20, scale = 2)
    private BigDecimal withdrawlAmount;

    @Column(nullable = false, precision = 20, scale = 2)
    private BigDecimal balanceAmount;

    @Column(nullable = false, precision = 20, scale = 2)
    private BigDecimal depositAmount;
}
