package Assignments.Assignment2_FianKisero;

public class Manager extends Employee {

        private String department;

        // Constructor
        public Manager(String name, int id, double salary, String department) {
            super(name, id, salary); // Call parent constructor
            setDepartment(department);
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            if (department == null || department.isBlank()) {
                throw new IllegalArgumentException("Department cannot be empty.");
            }
            this.department = department;
        }

        // Override bonus calculation
        @Override
        public double calculateBonus() {
            return getSalary() * 0.15;
        }

        // Override displayInfo to add department
        @Override
        public void displayInfo() {
            super.displayInfo(); // Call parent method
            System.out.println("Department: " + department);
        }
}

