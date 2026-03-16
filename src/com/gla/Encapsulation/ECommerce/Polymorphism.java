package com.gla.Encapsulation.ECommerce;

import java.util.*;

class ECommerceMain {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics(1, "Laptop", 50000));

        for (Product p : products) {
            double finalPrice = p.getPrice() - p.calculateDiscount();
            if (p instanceof Taxable) {
                finalPrice += ((Taxable)p).calculateTax();
            }
            System.out.println(p.getName() + " Final Price: " + finalPrice);
        }
    }
}
