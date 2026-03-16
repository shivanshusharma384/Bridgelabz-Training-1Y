package com.gla.methods.level1;
import java.util.Scanner;
public class AthleteRun {
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return 5000 / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        double s1 = sc.nextDouble();

        System.out.print("Enter side 2: ");
        double s2 = sc.nextDouble();

        System.out.print("Enter side 3: ");
        double s3 = sc.nextDouble();

        double rounds = calculateRounds(s1, s2, s3);

        System.out.println("Number of rounds required to complete 5 km: " + rounds);
    }
}
