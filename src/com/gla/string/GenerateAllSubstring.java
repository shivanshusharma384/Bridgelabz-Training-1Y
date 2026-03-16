package com.gla.string;

public class GenerateAllSubstring {
    public static void main(String[] args) {
        String str = "Hello";
        int len = str.length();
        for (int i=0;i<len;i++){
            for (int j=i;j<=len;j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
}
