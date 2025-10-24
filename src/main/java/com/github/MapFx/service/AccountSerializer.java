package com.github.MapFx.service;
import com.github.MapFx.domain.Account;
import com.github.MapFx.domain.CheckingAccount;

import java.util.ArrayList;

public class AccountSerializer {
    public static Account toAccount(String string){
        //TODO convert CSV Account string to Account object
        return null;
    }

    public static String toString(Account account){
        //TODO convert Account object to CSV Account String
        return null;
    }

    public static ArrayList<Account> getAccounts(){
        //TODO implement file IO (read accounts from csv file + error handling)

        //For testing purposes:
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new CheckingAccount(4202,7775,"Chaz McClutzky"));
        accounts.add(new CheckingAccount(3311,1461,"Duke Nukem"));
        accounts.add(new CheckingAccount(6969,4646,"Guy Doom"));
        accounts.add(new CheckingAccount(3724,99996,"John Maester"));
        accounts.add(new CheckingAccount(1951,0,"Alfredo Leatherchest"));
        accounts.add(new CheckingAccount(4333,37,"Mario Marioson"));
        accounts.add(new CheckingAccount(1111,137,"Doug Drinkwater"));
        accounts.add(new CheckingAccount(0000,132323,"I. C. Weiner"));

        return accounts;
    }

    public void writeAccountsToFile(ArrayList<Account> accounts){
        //TODO implement file IO (take accounts and write CSV file)
    }
}
