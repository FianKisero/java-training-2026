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
        int x = 10; // Basic assignment
        x += 5; // x = x + 5 → 15
        x -= 3; // x = x - 3 → 12
        x *= 2; // x = x * 2 → 24
        x /= 4; // x = x / 4 → 6
        x %= 4; // x = x % 4 → 2
        System.out.println("Final x: " + x);
    }

    public static void comparisonOperators() {
        System.out.println("=====================comparisonOperators======================");
        int a = 10, b = 5, c = 10;
        System.out.println("a == c: " + (a == c)); // true
        System.out.println("a != b: " + (a != b)); // true
        System.out.println("a > b: " + (a > b)); // true
        System.out.println("a < b: " + (a < b)); // false
        System.out.println("a >= c: " + (a >= c)); // true
        System.out.println("b <= a: " + (b <= a)); // true
// For objects, use .equals() instead of ==
        String s1 = "hello";
        String s2 = "hello";
        System.out.println("Strings equal: " + s1.equals(s2)); // true
    }

    public static void logicalOperators() {
        System.out.println("=====================logicalOperators======================");
        boolean isSunny = true;
        boolean isWeekend = false;
        int temperature = 25;
// AND (&&) - both must be true
        System.out.println("Good weather: " +
                (isSunny && temperature > 20)); // true
// OR (||) - at least one true
        System.out.println("Outdoor day: " +
                (isSunny || isWeekend)); // true
// NOT (!) - reverse the value
        System.out.println("Not sunny: " + !isSunny); // false
// Complex condition
        System.out.println("Perfect day: " +
                (isSunny && temperature > 20 && !isWeekend)); // true

    }

}