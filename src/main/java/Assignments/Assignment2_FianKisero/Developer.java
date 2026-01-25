package Assignments.Assignment2_FianKisero;

public class Developer extends Employee {

    private String programmingLanguage;

    // Constructor
    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary); // Parent constructor
        setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage == null || programmingLanguage.isBlank()) {
            throw new IllegalArgumentException("Programming language cannot be empty.");
        }
        this.programmingLanguage = programmingLanguage;
    }

    // Override bonus calculation
    @Override
    public double calculateBonus() {
        return getSalary() * 0.10;
    }

    // Override displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent version
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

