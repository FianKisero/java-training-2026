/**
 * Assessment 3: Mid-Term Practical Test
 * Student: Fian Kisero
 * Date: 2/2/2026
 * Problem: 1
 *
 * Key Features:
 * - polymorphism,abstraction,
 * - conditional exception
 * - [Any additional notable implementations]
 */
package Assignments.Assignments3_FianKisero.Problem1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LibraryItem[] items = {
                new Book("B001", "Java Programming", "John Doe", true, "123-4567890123", "Education"),
                new DVD("D001", "Java Tutorial", "Jane Smith", false, "PG", 7),
                new Magazine("M001", "Tech Monthly", "Tech Press", true, 12, LocalDate.of(2025, 5, 17))
        };

        for (LibraryItem item : items) {
            item.displayDetails();
            item.checkout(item.isAvailable());
        }
    }
}
