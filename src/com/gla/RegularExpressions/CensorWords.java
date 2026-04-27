package com.gla.RegularExpressions;

public class CensorWords {
    public static void main(String[] args) {
        String text = "This is a damn bad example with some stupid words.";

        text = text.replaceAll("(?i)damn|stupid", "****");

        System.out.println(text);
    }
}
