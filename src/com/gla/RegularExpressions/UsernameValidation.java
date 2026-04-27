package com.gla.RegularExpressions;

public class UsernameValidation {
    public static void main(String[] args) {
        String username = "user_123";

        if (username.matches("^[A-Za-z][A-Za-z0-9_]{4,14}$")) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}