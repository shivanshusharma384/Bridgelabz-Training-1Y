package com.gla.Package.library;
/*
import library.books.*;
import library.members.*;
import library.transactions.*;
*/

public class MainApp {
    public static void main(String[] args) {
        Book b = new Book();
        b.input();

        Member m = new Member();
        m.input();

        Transaction t = new Transaction();
        t.issue(b.title, m.name);
    }
}
