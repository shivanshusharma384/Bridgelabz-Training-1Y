package com.gla.methods.level3;
import java.util.Scanner;
public class NumberChecker2 {
    public static int[] getDigits(int n) {
        String s = String.valueOf(Math.abs(n));
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int d : digits)
            sum += d;
        return sum;
    }

    public static boolean isHarshad(int n, int[] digits) {
        return n % sumDigits(digits) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int[] digits = getDigits(n);
        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++)
            freq[i][0] = i;

        for (int d : digits)
            freq[d][1]++;

        System.out.println("Sum of Digits: " + sumDigits(digits));
        System.out.println("Harshad Number: " + isHarshad(n, digits));

        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++)
            if (freq[i][1] > 0)
                System.out.println(i + " -> " + freq[i][1]);
    }
}
