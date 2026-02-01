/**
 * Assessment 3: Mid-Term Practical Test
 * Student: Fian Kisero
 * Date: 2/2/2026
 * Problem: Problem 4
 *
 * Key Features:
 * - Inheritance and encapsulation covered
 * - custom exception class InvalidSalaryException
 * - [Any additional notable implementations]
 */
package Assignments3_FianKisero.Problem4;

public class Main {
            public static void main(String[] args) {

                try {
                    Employee.setCompanyName("Tech Solutions Ltd");

                    Employee emp = new Employee("Alice", 20000);
                    emp.setSalary(50000);

                    System.out.println("Company: " + Employee.getCompanyName());
                    System.out.println("Employee: " + emp.getEmployeeName());
                    System.out.println("Salary: " + emp.getSalary());
                    System.out.println("Bonus: " + emp.calculateBonus());

                } catch (InvalidSalaryException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
}



