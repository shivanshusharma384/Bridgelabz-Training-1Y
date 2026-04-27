package com.gla.RegularExpressions;

import java.util.regex.*;

public class CapitalWords {
    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris";

        Pattern p = Pattern.compile("\\b[A-Z][a-zA-Z]*\\b");
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}