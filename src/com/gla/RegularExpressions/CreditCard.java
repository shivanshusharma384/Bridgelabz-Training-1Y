package com.gla.RegularExpressions;

public class CreditCard {
    public static void main(String[] args) {
        String card = "4123456789012345";

        if (card.matches("^(4\\d{15}|5\\d{15})$")) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}

