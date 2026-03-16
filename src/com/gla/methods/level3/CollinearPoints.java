package com.gla.methods.level3;
import java.util.Scanner;
public class CollinearPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates for Point A:");
        System.out.print("x1: ");
        double x1 = sc.nextDouble();
        System.out.print("y1: ");
        double y1 = sc.nextDouble();

        System.out.println("Enter coordinates for Point B:");
        System.out.print("x2: ");
        double x2 = sc.nextDouble();
        System.out.print("y2: ");
        double y2 = sc.nextDouble();

        System.out.println("Enter coordinates for Point C:");
        System.out.print("x3: ");
        double x3 = sc.nextDouble();
        System.out.print("y3: ");
        double y3 = sc.nextDouble();

        boolean collinearSlope = checkCollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean collinearArea = checkCollinearByArea(x1, y1, x2, y2, x3, y3);

        System.out.println("\nUsing Slope Method: " + (collinearSlope ? "Collinear" : "Not Collinear"));
        System.out.println("Using Area Method: " + (collinearArea ? "Collinear" : "Not Collinear"));
    }

    public static boolean checkCollinearBySlope(double x1, double y1, double x2, double y2,
                                                double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        return Math.abs(slopeAB - slopeBC) < 0.0001 && Math.abs(slopeBC - slopeAC) < 0.0001;
    }

    public static boolean checkCollinearByArea(double x1, double y1, double x2, double y2,
                                               double x3, double y3) {
        double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area < 0.0001;
    }
}
