package com.github.MapFx.ui;

import java.util.Scanner;

// Handles the menu loop - read input and print options.
public class CLIMenu {
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
        //TODO Utilizing a Template Method Pattern to create accounts of different types
        //TODO Utilize an enum for account types
        //TODO Create a service class that handles account creation
        System.out.println("\n=== Create Account ===");
        terminalActive = false;
    }

    public void accessAccount(){
        //TODO Create a database class that holds all of the accounts in local memory.
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
