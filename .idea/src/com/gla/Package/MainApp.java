package com.gla.Package;

import static java.lang.Math.*;
import java.util.Scanner;

class InterestCalculator {
    double calculateSI(double P,double R,double T){
        return (P*R*T)/100;
    }

    double calculateCI(double P,double R,double T){
        return P*(pow((1+R/100),T))-P;
    }
}

public class MainApp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter P R T: ");
        double P=sc.nextDouble();
        double R=sc.nextDouble();
        double T=sc.nextDouble();

        InterestCalculator ic=new InterestCalculator();
        System.out.println("Simple Interest: "+ic.calculateSI(P,R,T));
        System.out.println("Compound Interest: "+ic.calculateCI(P,R,T));
    }
}
