package com.github.MapFx.domain;

public enum AccountType {
    CHECKING("Checking"),
    CREDIT("Credit"),
    DEBIT("Debit");

    private final String label;

    AccountType(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
