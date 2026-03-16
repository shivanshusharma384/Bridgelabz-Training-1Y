package com.gla.Package.library;
import java.util.Scanner;

public class Member {
    public String name;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Member Name: ");
        name = sc.nextLine();
    }
}
