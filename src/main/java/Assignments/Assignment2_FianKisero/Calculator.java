package Assignments.Assignment2_FianKisero;

public class Calculator {

    // Method overloading (same method name, different parameters)

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public String add(String a, String b) {
        return a + b; // String concatenation
    }
}
