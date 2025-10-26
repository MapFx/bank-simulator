package com.github.MapFx.domain;

public class SavingsAccount extends Account{

    public SavingsAccount(String customerName, int pin) {
        super(customerName, pin);
        super.setAccountType(AccountType.SAVINGS);
    }

    public SavingsAccount(String customerName, String accountNumber, int pin, double balance) {
        super(customerName, accountNumber, pin, balance);
        super.setAccountType(AccountType.SAVINGS);

    }
}
