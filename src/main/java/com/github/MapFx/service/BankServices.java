package com.github.MapFx.service;
import java.util.Random;

import com.github.MapFx.domain.*;

public class BankServices {
    AccountDatabase accountDatabase;
    Account selectedAccount;

    public BankServices(AccountDatabase accountDatabase){
        this.accountDatabase = accountDatabase;
        selectedAccount = null;
    }

    public static String generateCardNumber() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(16);

        for (int i = 0; i < 16; i++) {
            sb.append(random.nextInt(10)); // appends a random digit 0–9
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    // Create account and adds it to the local database & stores the reference to said account
    public void openAccount(String customerName, String accountType, int pin) {
        accountType = accountType.toUpperCase();
        selectedAccount = null;
        switch (accountType) {
            case "CHECKING" -> selectedAccount = new CheckingAccount(customerName,pin);
            case "SAVINGS" -> selectedAccount = new SavingsAccount(customerName,pin);
            case "CREDIT" -> selectedAccount = new CreditAccount(customerName,pin);
            default -> System.out.println("Invalid account type provided");
        }

        if(selectedAccount != null) accountDatabase.appendAccount(selectedAccount);
    }

    // selectedAccount stores a reference to the account with the account number selected or null
    //public static Account lookUpAccount(String accountNumber) {
     //   return AccountDatabase.getAccountByNumber(accountNumber);
    //}

    public Account getSelectedAccount() {
        return selectedAccount;
    }

    public boolean isValidAccountNumber(String accountNumber) {
        return accountDatabase.getAccountByNumber(accountNumber) != null;
    }

    public void selectAccount(Account selectedAccount) {
        this.selectedAccount = selectedAccount;
    }

    public void selectAccount(String accountNumber) {
        this.selectedAccount = accountDatabase.getAccountByNumber(accountNumber);
    }
}
