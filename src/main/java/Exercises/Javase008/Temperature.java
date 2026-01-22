package Exercises.Javase008;

public class Temperature {

    private double celsius;

   public Temperature(double celsius){
       setCelsius(celsius);
   }

   public double getCelsius() {
       return celsius;
   }

   public void setCelsius(double celsius) {
       if (celsius >= -273.15) {
           this.celsius = celsius;
       } else {
           System.out.println("Celsius is out of range");
       }
   }

   public double getFahrenheit() {
       return celsius * 1.8 + 32;
   }

   public double getKelvin() {
       return celsius + 273.15;
   }

    public void setFahrenheit(double fahrenheit) {
        double converted = (fahrenheit - 32) * 5 / 9;
        setCelsius(converted);
    }

    public void setKelvin(double kelvin) {
        double converted = kelvin - 273.15;
        setCelsius(converted);
    }

//    public void displayAllScales(){
//        System.out.println("Celsius: " + getCelsius());
//        System.out.println("Fahrenheit: " + getFahrenheit());
//        System.out.println("Kelvin: " + getKelvin());
//    }
}
