package com.gla.string;

public class LC58 {
    public int lengthOfLastWord(String s) {
        String[] mystr= s.split(" ");

        int len = mystr[mystr.length-1].length();

        return len;
    }

    static void main() {

    }
}
