package com.gla.Package;
import static java.lang.Math.*;
import java.util.Scanner;

public class StaticDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        double num = sc.nextDouble();

        System.out.println("Square Root: " + sqrt(num));
        System.out.println("Power (num^2): " + pow(num,2));
        System.out.println("Max (num,10): " + max(num,10));
        System.out.println("Min (num,10): " + min(num,10));
        System.out.println("Absolute: " + abs(num));
    }
}
