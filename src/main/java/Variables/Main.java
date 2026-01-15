package Variables;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.printf("=======PrimitiveDataTypes=======");
        // Integer types
        int age = 25;
        long bigNumber = 123456789L;
// Decimal types
        float price = 19.99f;
        double precise = 3.1415926535;
// Character and boolean
        char grade = 'A';
        boolean isJavaFun = true;
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("isJavaFun: " + isJavaFun);

        System.out.printf("=======ReferenceDataTypes=======");
        // String is a reference type
        String name = "Fian Kisero ";
        String message = new String("Hello");
// Arrays are reference types
        int[] scores = {90, 85, 95};
        String[] names = {"Alice", "Bob", "Charlie"};

        System.out.printf("=======inferenceDataTypes=======");
        // Instead of explicit types:
        String name1 = "Alice";
        List<String> names1 = new ArrayList<>();
// You can use 'var':
        var userName = "Alice"; // Inferred as String
        var numbers = new ArrayList<>(); // Inferred as ArrayList<Object>
        var age2 = 25; // Inferred as int
// Note: Must initialize when using 'var'
        //var count; // ERROR: Cannot use 'var' without initializer

        // Regular variable (can change)
        int score = 100;
        score = 95; // Allowed
// Constant (cannot change)
        final double PI = 3.14159;
       // PI = 3.14; // COMPILER ERROR!
        final int MAX_USERS = 100;
        final String COMPANY_NAME = "Tech Corp";

        System.out.printf("Name: Fian Kisero");
        System.out.printf("Goal: I decree and declare I will java certified");
        System.out.printf("Excited to Learn: Object-Oriented Programming");


        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}