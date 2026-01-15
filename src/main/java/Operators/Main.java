package Operators;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        arithmeticOperators();
        assignmentOperators();
        comparisonOperators();
        logicalOperators();
    }

    public static void arithmeticOperators() {
        System.out.println("=====================arithmeticOperators======================");
        int a = 15, b = 4;
        System.out.println("a + b = " + (a + b)); // 19
        System.out.println("a - b = " + (a - b)); // 11
        System.out.println("a * b = " + (a * b)); // 60
        System.out.println("a / b = " + (a / b)); // 3 (integer division)
        System.out.println("a % b = " + (a % b)); // 3 (remainder)
        double result = (double) a / b; // 3.75 (decimal division)
        System.out.println("Decimal division: " + result);
    }

    public static void assignmentOperators() {
        System.out.println("=====================assignmentOperators======================");

    }

    public static void comparisonOperators() {
        System.out.println("=====================comparisonOperators======================");

    }

    public static void logicalOperators() {
        System.out.println("=====================logicalOperators======================");

    }

}