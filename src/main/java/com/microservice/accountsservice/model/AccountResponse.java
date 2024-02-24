package com.microservice.accountsservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.support.SimpleTriggerContext;

import java.math.BigInteger;

@Slf4j
@Builder
@Data@AllArgsConstructor
@NoArgsConstructor
public class AccountResponse {
    private Long AccountNumber;
    private String transactionDetails;
    private BigInteger withdrawlAmount;
    private BigInteger balanceAmount;
    private BigInteger depositAmount;
}
