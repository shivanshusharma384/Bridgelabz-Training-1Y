package com.gla.Inheritance;

class Printer {
    void print() {
        System.out.println("Printing...");
    }
}

class Manager {
    private Printer printer = new Printer();

    void printDoc() {
        printer.print(); // delegation
    }
}
