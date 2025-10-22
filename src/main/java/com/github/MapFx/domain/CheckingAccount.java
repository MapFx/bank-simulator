package com.github.MapFx.domain;

import com.github.MapFx.service.BankServices;

public class CheckingAccount extends Account{
    public CheckingAccount(int pin, double initialBalance, String customerName, AccountType accountType) {
        super(pin, initialBalance, customerName, accountType);
    }
    public CheckingAccount(int pin, long accountNumber, double balance, String customerName, AccountType accountType) {
        super(pin, accountNumber, balance, customerName, accountType);
    }
}
