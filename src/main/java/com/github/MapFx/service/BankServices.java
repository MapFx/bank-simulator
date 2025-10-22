package com.github.MapFx.service;
import java.util.Random;

public class BankServices {
    public static long generateCardNumber() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(16);

        for (int i = 0; i < 16; i++) {
            sb.append(random.nextInt(10)); // appends a random digit 0–9
        }

        return Long.parseUnsignedLong(sb.toString());
    }
}
