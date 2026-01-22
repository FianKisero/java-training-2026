package Exercises.Javase008;

public class Main {
    public static void main(String[] args) {
        Temperature temperature = new Temperature(-300.0);
        Temperature temperature2 = new Temperature(45.0);
        Temperature temperature3 = new Temperature(25.0);
        Student student = new Student("123456", "Fian", 25, 4.0);
        LibraryBookSytem bookSytem = new LibraryBookSytem("4234567890111", "Battfield of the mind","Joyce Meyer");


        System.out.println("==========Display of temperatures==========");
        System.out.println("Celsius: " + temperature.getCelsius());
        System.out.println("Fahrenheit: " + temperature.getFahrenheit());
        System.out.println("Kelvin: " + temperature.getKelvin());

        System.out.printf("Celsius: %.2f%n", temperature2.getCelsius());
        System.out.println("Fahrenheit: " + temperature2.getFahrenheit());
        System.out.println("Kelvin: " + temperature2.getKelvin());

        System.out.printf("Celsius: %.2f%n", temperature3.getCelsius());
        System.out.println("Fahrenheit: " + temperature3.getFahrenheit());
        System.out.println("Kelvin: " + temperature3.getKelvin());

        System.out.println("==========Display of students==========");
        student.display();
        System.out.println();

        System.out.println("==========Display of libraries==========");

        System.out.println("--------- Book Details ---------");
        System.out.println("isbn: " + bookSytem.getIsbn());
        System.out.println("Title: " + bookSytem.getTitle());
        System.out.println("author: " + bookSytem.getAuthor());





    }
}
