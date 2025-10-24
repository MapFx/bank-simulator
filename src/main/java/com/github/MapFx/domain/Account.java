package com.github.MapFx.domain;
import com.github.MapFx.service.BankServices;

public abstract class Account {
    private int pin;
    private long accountNumber;
    private double balance;
    private String customerName;
    private AccountType accountType;

    public Account(int pin, double initialBalance, String customerName) {
        this.pin = pin;
        this.accountNumber = BankServices.generateCardNumber();
        this.balance = initialBalance;
        this.customerName = customerName;
        this.accountType = accountType;
    }
    public Account(int pin, long accountNumber, double balance, String customerName) {
        this.pin = pin;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.accountType = accountType;
    }

    public void printAccount() {
        System.out.println("Customer Name: " + this.customerName);
        System.out.println("-----------------------------");
        System.out.println("Account Type: " + this.accountType.toString());
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Balance: " + this.balance);

    }
}
