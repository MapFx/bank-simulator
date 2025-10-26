package com.github.MapFx.ui;

import com.github.MapFx.domain.*;
import com.github.MapFx.service.AccountDatabase;
import com.github.MapFx.service.BankServices;

public class Main {
    public static void main(String[] args) {
        AccountDatabase accountDatabase = new AccountDatabase();
        BankServices bankServices = new BankServices(accountDatabase);
        accountDatabase.initialize();
        CLIMenu menu = new CLIMenu(bankServices);
        menu.open();

    }
}