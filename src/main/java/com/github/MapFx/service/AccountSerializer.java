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
        accounts.add(new CheckingAccount("Gog Gog","1234567812345678",1234,12440));
        accounts.add(new CheckingAccount("Chaz McClutzky", 4202));
        accounts.add(new CheckingAccount("Duke Nukem", 3311));
        accounts.add(new CheckingAccount("Guy Doom", 6969));
        accounts.add(new CheckingAccount("John Maester", 3724));
        accounts.add(new CheckingAccount("Alfredo Leatherchest", 1951));
        accounts.add(new CheckingAccount("Mario Marioson", 4333));
        accounts.add(new CheckingAccount("Doug Drinkwater", 1111));
        accounts.add(new CheckingAccount("I. C. Weiner", 0000));

        return accounts;
    }

    public void writeAccountsToFile(ArrayList<Account> accounts){
        //TODO implement file IO (take accounts and write CSV file)
    }
}
