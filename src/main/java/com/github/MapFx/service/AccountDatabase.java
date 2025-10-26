package com.github.MapFx.service;

import com.github.MapFx.domain.Account;

import java.util.ArrayList;

public class AccountDatabase {
    private static ArrayList<Account> accounts;

    public AccountDatabase(){
    }

    public static void initialize(){
        accounts = AccountSerializer.getAccounts();
    }
    public static void appendAccount(Account account){
        if(accounts==null){
            accounts = new ArrayList<>();
            accounts.add(account);
            return;
        }
        accounts.add(account);
    }

    public static Account getAccountByNumber(String accountNumber){
        if(accounts==null){
            return null;
        }

        for(Account account:accounts){
            if(account.getAccountNumber().equals(accountNumber)){
                return account;
            }
        }
        return null;
    }
}
