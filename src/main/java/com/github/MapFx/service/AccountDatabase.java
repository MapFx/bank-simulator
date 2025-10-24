package com.github.MapFx.service;

import com.github.MapFx.domain.Account;

import java.util.ArrayList;

public class AccountDatabase {
    private ArrayList<Account> accounts;

    public AccountDatabase(){
        accounts = AccountSerializer.getAccounts();
    }

    public void createAccount(Account account){
        this.accounts.add(account);
    }
}
