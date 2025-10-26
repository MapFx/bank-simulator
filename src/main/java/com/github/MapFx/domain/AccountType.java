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
}
