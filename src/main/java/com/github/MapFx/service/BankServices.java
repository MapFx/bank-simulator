package com.github.MapFx.service;
import java.util.Random;

import com.github.MapFx.domain.*;

public class BankServices {
    AccountDatabase accountDatabase;
    Account activeAccount;

    public BankServices(AccountDatabase accountDatabase){
        this.accountDatabase = accountDatabase;
        activeAccount = null;
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

    public void createAccount(String customerName, String accountType, int pin) {
        accountType = accountType.toUpperCase();
        System.out.println("Account Type : " + accountType);
        int initialBalance = 0;

        switch (accountType) {
            case "CHECKING" -> accountDatabase.appendAccount(new CheckingAccount(customerName,pin));
            case "SAVINGS" -> accountDatabase.appendAccount(new SavingsAccount(customerName,pin));
            case "CREDIT" -> accountDatabase.appendAccount(new CreditAccount(customerName,pin));
            default -> System.out.println("Invalid account type provided");
        }
    }

    public static Account lookUpAccount(String accountNumber) {
        return AccountDatabase.getAccountByNumber(accountNumber);
    }

    public Account getActiveAccount() {
        return activeAccount;
    }
    public void setActiveAccount(Account activeAccount) {
        this.activeAccount = activeAccount;
    }
}
