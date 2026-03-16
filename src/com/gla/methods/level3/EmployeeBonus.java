package com.gla.methods.level3;
import java.util.*;
public class EmployeeBonus {
    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData();
        double[][] updatedData = calculateNewSalary(employeeData);
        displayResults(employeeData, updatedData);
    }

    public static int[][] generateEmployeeData() {
        Random rand = new Random();
        int[][] data = new int[10][2]; // [salary, years of service]

        for (int i = 0; i < 10; i++) {
            data[i][0] = 10000 + rand.nextInt(90000); // 5-digit salary
            data[i][1] = rand.nextInt(20) + 1; // 1-20 years
        }
        return data;
    }

    public static double[][] calculateNewSalary(int[][] data) {
        double[][] result = new double[10][3]; // [new salary, bonus amount, bonus %]

        for (int i = 0; i < 10; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            double bonusRate = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusRate;

            result[i][0] = salary + bonus;
            result[i][1] = bonus;
            result[i][2] = bonusRate * 100;
        }
        return result;
    }

    public static void displayResults(int[][] oldData, double[][] newData) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;

        System.out.println("Emp\tOld Salary\tYears\tBonus%\tBonus Amt\tNew Salary");

        for (int i = 0; i < 10; i++) {
            totalOld += oldData[i][0];
            totalNew += newData[i][0];
            totalBonus += newData[i][1];

            System.out.printf("%d\t%d\t\t%d\t%.0f%%\t%.2f\t\t%.2f%n",
                    (i+1), oldData[i][0], oldData[i][1],
                    newData[i][2], newData[i][1], newData[i][0]);
        }
        System.out.printf("Total\t%.2f\t\t\t\t%.2f\t\t%.2f%n", totalOld, totalBonus, totalNew);
    }
}
