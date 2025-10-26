package com.github.MapFx.domain;
import com.github.MapFx.service.BankServices;

public abstract class Account {
    private int pin;
    private String accountNumber;
    private double balance;
    private String customerName;
    private AccountType accountType;

    public Account(String customerName, int pin) {
        this.pin = pin;
        this.accountNumber = BankServices.generateCardNumber();
        this.balance = 0;
        this.customerName = customerName;
        this.accountType = accountType;
    }
    public Account(String customerName, String accountNumber, int pin, double balance) {
        this.pin = pin;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.accountType = accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public int getPin() {
        return pin;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void printAccount() {
        System.out.println("\nCustomer Name: " + this.customerName);
        System.out.println("Account Type: " + this.accountType.toString());
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Balance: " + this.balance + "\n");

    }
}
