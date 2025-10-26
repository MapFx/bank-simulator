package com.github.MapFx.domain;

public enum AccountType {
    CHECKING("Checking"),
    SAVINGS("Savings"),
    CREDIT("Credit");

    private final String label;

    AccountType(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }

    public static boolean isValid(String s){
        if(s == null) return false;

        for (AccountType t : AccountType.values()) {
            if(s.equalsIgnoreCase(t.label)) return true;
        }

        return false;
    }
}
