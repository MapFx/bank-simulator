package com.github.MapFx.domain;

public class CheckingAccount extends Account{

    public CheckingAccount(String customerName, int pin) {
        super(customerName, pin);
        super.setAccountType(AccountType.CHECKING);
    }

    public CheckingAccount(String customerName, String accountNumber, int pin, double balance) {
        super(customerName, accountNumber, pin, balance);
    }
}
