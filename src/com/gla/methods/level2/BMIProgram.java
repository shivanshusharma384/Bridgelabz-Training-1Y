package com.gla.methods.level2;
import java.util.Scanner;
public class BMIProgram {
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double heightInMeters = data[i][1] / 100;
            data[i][2] = data[i][0] / (heightInMeters * heightInMeters);
        }
    }

    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] persons = new double[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg): ");
            persons[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm): ");
            persons[i][1] = sc.nextDouble();
        }

        calculateBMI(persons);

        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) +
                    " BMI: " + persons[i][2] +
                    " Status: " + getStatus(persons[i][2]));
        }
    }
}
