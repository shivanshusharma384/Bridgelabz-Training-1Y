package com.gla.Inheritance;

class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    // No override needed if same behavior
}
