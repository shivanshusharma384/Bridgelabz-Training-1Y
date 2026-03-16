package com.gla.Encapsulation.Banking;

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public double calculateInterest() {
        return getBalance() * 0.04;
    }
}
