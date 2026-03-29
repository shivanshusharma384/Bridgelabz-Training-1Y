package com.gla.Inheritance;

class A {
    void show(int a) {}
}

class B extends A {
    // Not overriding, just overloading → confusing
    void show(double a) {}
}
