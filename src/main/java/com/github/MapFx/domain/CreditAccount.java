package com.github.MapFx.domain;

public class CreditAccount extends Account{

    public CreditAccount(String customerName, int pin) {
        super(customerName, pin);
        super.setAccountType(AccountType.CREDIT);
    }

    public CreditAccount(String customerName, String accountNumber, int pin, double balance) {
        super(customerName, accountNumber, pin, balance);
    }
}
