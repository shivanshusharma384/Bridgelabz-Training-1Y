package com.gla.Package.library;
import java.util.Scanner;

public class Book {
    public String title;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book Title: ");
        title = sc.nextLine();
    }
}