package com.github.MapFx.ui;

import com.github.MapFx.service.AccountDatabase;

import java.util.Scanner;

// Handles the menu loop - read input and print options.
public class CLIMenu {
    private AccountDatabase database = new AccountDatabase();
    private boolean terminalActive = true;
    private final Scanner scanner = new Scanner(System.in);

    public void open(){
        terminalActive = true;

        while(terminalActive) {
            System.out.println("\nWelcome to the Bank of Banking terminal!");
            showMainMenuOptions();
            mainMenuSelection();
        }
    }

    private void showMainMenuOptions(){
        System.out.println("\n=== Main Menu ===");
        System.out.println("1. Create Account");
        System.out.println("2. Access Account");
        System.out.println("3. Exit");
    }

    private void mainMenuSelection(){
        System.out.print("\nChoose an option:");
        String selection = scanner.nextLine().trim();
        switch (selection) {
            case "1" -> createAccount();
            case "2" -> accessAccount();
            case "3" -> exit();
        }
    }

    public void createAccount(){
        System.out.println("\n=== Create Account ===");
        terminalActive = false;
        //TODO menu loop for account creation - probably contain logic in another class
    }

    public void accessAccount(){
        //TODO create search method in AccountDatabase class to find account by account number
        System.out.println("\n=== Access Account ===");
        terminalActive = false;
    }

    public void exit(){
        System.out.println("Exiting Bank of Banking terminal.");
        terminalActive = false;
    }

    //Personal learning - make class instance - this way I can modify the state of the class. (terminalActive).

    //AI improvements   - moved menu options and user input to their own methods for cleanliness
    //                  - switched input to a string and trimmed it to clean the input, multiple words will mess things
    //                  up.
    //                  - Menu loop - instead of exiting the program.
}
