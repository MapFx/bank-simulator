package com.github.MapFx.ui;
import com.github.MapFx.domain.AccountType;

public class InputValidators {

    // Returns true only if the name entered matchest format: Firstname Lastname
    public static boolean isValidName(String name) {
        return name != null && name.trim().matches("^[A-Z][a-zA-Z'\\-]+ [A-Z][a-zA-Z'\\-]+$");
    }

    // Returns true only if the pin contains 4 digits
    public static boolean isValidPin(String pin) {
        return pin != null && pin.matches("\\d{4}");
    }

    // Returns true only if the account type exists in the AccountType enum
    public static boolean isValidAccountType(String type) {
        return AccountType.isValid(type);
    }

    // Returns true only if the account number contains 16 digits
    public static boolean isValidAccountNumber(String number) {
        return number != null && number.matches("\\d{16}");
    }
}