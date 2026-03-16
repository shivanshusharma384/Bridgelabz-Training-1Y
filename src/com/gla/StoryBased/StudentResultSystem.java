package com.gla.StoryBased;

import java.util.Scanner;

// Parent Class
class Student {
    int rollNo;
    String name;
    int marks;

    // Method to calculate grade
    void calculateGrade() {
        char grade;

        if (marks >= 90)
            grade = 'A';
        else if (marks >= 75)
            grade = 'B';
        else if (marks >= 60)
            grade = 'C';
        else if (marks >= 50)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("\n----- Student Result -----");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}

// Subclass
class EngineeringStudent extends Student {
    String branch;

    void appendBranch() {
        // String concatenation
        name = name.concat(" (" + branch + ")");
    }
}

// Main Class
public class StudentResultSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EngineeringStudent s = new EngineeringStudent();

        System.out.print("Enter Roll Number: ");
        s.rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        s.name = sc.nextLine();

        System.out.print("Enter Marks: ");
        s.marks = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Branch: ");
        s.branch = sc.nextLine();

        // Append branch to name
        s.appendBranch();

        // Calculate and display grade
        s.calculateGrade();

        sc.close();
    }
}