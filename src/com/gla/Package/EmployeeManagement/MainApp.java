package com.gla.Package.EmployeeManagement;

import com.gla.Package.EmployeeManagement.Employee.*;
import com.gla.Package.EmployeeManagement.Payroll;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Department: ");
        String dept = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Employee e = new Employee(id,name,dept,salary);
        Payroll p = new Payroll();

        double newSalary = p.calculateBonus(e);
        System.out.println("Employee: "+e.getName());
        System.out.println("Salary after bonus: "+newSalary);
    }
}
