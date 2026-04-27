package com.gla.RegularExpressions;

public class HexColor {
    public static void main(String[] args) {
        String color = "#FFA500";

        if (color.matches("^#[0-9A-Fa-f]{6}$")) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
