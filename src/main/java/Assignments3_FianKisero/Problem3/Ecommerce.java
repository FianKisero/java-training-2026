/**
 * Assessment 3: Mid-Term Practical Test
 * Student: Fian Kisero
 * Date: 2/2/2026
 * Problem: 3
 *
 * Key Features:
 * - Abstraction,Inheritance, overriding, access modification
 * - Custom exceptions class
 * - [Any additional notable implementations]
 */
package Assignments3_FianKisero.Problem3;

import Assignments3_FianKisero.Problem3.exceptions.InvalidProductException;
import Assignments3_FianKisero.Problem3.exceptions.OutOfStockException;

public class Ecommerce {
    public static void main(String[] args) {
        try {
            Product laptop = new Electronics(
                    "E001", "Laptop", -999.99, 10, 24, 65
            ); // Invalid price

            laptop.reduceStock(15); // More than available stock

        } catch (InvalidProductException | OutOfStockException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
