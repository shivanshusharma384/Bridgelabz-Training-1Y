package com.gla.RegularExpressions;

import java.util.regex.*;

public class ExtractLinks {
    public static void main(String[] args) {
        String text = "Visit https://google.com and http://example.org";

        Pattern p = Pattern.compile("https?://[\\w.-]+");
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
