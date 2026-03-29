package com.gla.Inheritance;

class Bird {
    void fly() {
        System.out.println("Flying");
    }
}

class Sparrow extends Bird { }

// Bad example
class Ostrich extends Bird {
    void fly() {
        throw new UnsupportedOperationException(); // violates LSP
    }
}