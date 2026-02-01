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

public class Employee {
    private static String companyName = "Default Company";
    private String employeeName;
    private double salary;

    public Employee(String employeeName, double salary) throws InvalidSalaryException {
        if(employeeName == null || employeeName.isEmpty() || salary <= 0) {
            throw new InvalidSalaryException( "Employee name cannot be empty and salary amount must be positive");
        }
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        if(companyName == null || companyName.isEmpty()) {
            throw new IllegalArgumentException("Company name cannot be empty and salary amount must be positive");
        }
        Employee.companyName = companyName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) throws InvalidSalaryException {
        if (salary <= 0) {
            throw new InvalidSalaryException("Salary amount must be positive");
        }
        this.salary = salary;
    }

    public double calculateBonus() {
        return salary * 0.10;
    }



}
