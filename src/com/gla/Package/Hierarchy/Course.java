package com.gla.Package.Hierarchy;
import java.util.Scanner;

public class Course {
    private String courseName;
    private int duration;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Course Name: ");
        courseName = sc.nextLine();
        System.out.print("Enter Duration (months): ");
        duration = sc.nextInt();
    }

    public void display() {
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration + " months");
    }
}
