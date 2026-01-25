package Assignments.Assignment2_FianKisero;


    public class ScientificCalculator extends Calculator {

        // Method overriding
        @Override
        public int add(int a, int b) {
            System.out.println("ScientificCalculator: Adding two integers");
            return super.add(a, b); // calling parent method
        }

        // New methods (not overriding)
        public double power(double base, double exponent) {
            return Math.pow(base, exponent);
        }

        public double squareRoot(double num) {
            if (num < 0) {
                throw new IllegalArgumentException("Cannot calculate square root of negative number");
            }
            return Math.sqrt(num);
        }
    }
