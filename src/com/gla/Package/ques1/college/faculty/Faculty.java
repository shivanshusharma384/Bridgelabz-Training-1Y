
package com.gla.Package.ques1.college.faculty;

import java.util.Scanner;

public class Faculty {
    private String name;
    private String subject;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Faculty Name: ");
        name = sc.nextLine();
        System.out.print("Enter Subject: ");
        subject = sc.nextLine();
    }

    public void display() {
        System.out.println("Faculty Name: " + name);
        System.out.println("Subject: " + subject);
    }
}