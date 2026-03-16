package com.gla.methods.level3;
import java.util.*;
public class NumberChecker5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Is Perfect Number: " + isPerfectNumber(number));
        System.out.println("Is Abundant Number: " + isAbundantNumber(number));
        System.out.println("Is Deficient Number: " + isDeficientNumber(number));
        System.out.println("Is Strong Number: " + isStrongNumber(number));
    }

    public static boolean isPerfectNumber(int num) {
        int sum = sumOfProperDivisors(num);
        return sum == num;
    }

    public static boolean isAbundantNumber(int num) {
        int sum = sumOfProperDivisors(num);
        return sum > num;
    }

    public static boolean isDeficientNumber(int num) {
        int sum = sumOfProperDivisors(num);
        return sum < num;
    }

    public static int sumOfProperDivisors(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }
        return sum;
    }

    public static boolean isStrongNumber(int num) {
        int original = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        return sum == original;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
