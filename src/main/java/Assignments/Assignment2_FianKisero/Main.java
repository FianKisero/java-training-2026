package Assignments.Assignment2_FianKisero;

import Exercises.Javase008.LibraryBookSytem;

public class Main {
    public static void main(String[] args) {
        //Question1
        Book book1 = new Book("4234567890111", "Battfield of the mind","Joyce Meyer", 3000.00);
        //Question2
        Employee emp = new Employee("Alice", 101, 50000);
        Manager mgr = new Manager("Bob", 102, 80000, "IT");
        Developer dev = new Developer("Charlie", 103, 70000, "Java");

        //Question3
        Calculator calc = new Calculator();
        ScientificCalculator sciCalc = new ScientificCalculator();

        //Question2
        emp.displayInfo();
        System.out.println();

        mgr.displayInfo();
        System.out.println();

        dev.displayInfo();

        //Question1
        book1.borrowBook(4);
        System.out.println(book1);

        // Question3 Method Overloading examples
        System.out.println(calc.add(2, 3));
        System.out.println(calc.add(2.5, 3.5));
        System.out.println(calc.add(1, 2, 3));
        System.out.println(calc.add("Hello ", "World"));

        System.out.println();

        // Question3 Method Overriding example
        System.out.println(sciCalc.add(10, 20));

        // Question4 Scientific methods
        System.out.println(sciCalc.power(2, 3));
        System.out.println(sciCalc.squareRoot(16));

        // ===============================
        // 5. @Override Annotation Example
        // ===============================
        Developer dev1 = new Developer("Carol", 103, 70000, "Java");

        System.out.println("\n@Override Annotation Example:");
        dev.displayInfo();
        System.out.println("Developer Bonus: " + dev.calculateBonus());
    }
}
