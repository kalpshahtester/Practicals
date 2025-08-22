package Practical;

public class Practical_9 {

public static void main(String[] args) {
        
        // 1. Data
        double fahrenheit = 85;  

        // 2. Calculation
        double celsius = (fahrenheit - 32) * 5 / 9;

        // 3. Output
        System.out.println("Temperature in Fahrenheit: " + fahrenheit + "°F");
        System.out.printf("Converted into temperature into Centigrade degrees: %.2f°C", celsius);
    }
}

