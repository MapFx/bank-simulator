package com.github.MapFx.domain;

import com.github.MapFx.service.BankServices;

public class CheckingAccount extends Account{

    public CheckingAccount(int pin, double initialBalance, String customerName) {
        super(pin, initialBalance,customerName);
    }

    public CheckingAccount(int pin, long accountNumber, double balance, String customerName) {
        super(pin, accountNumber, balance,customerName);
    }
}
