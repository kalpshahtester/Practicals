package Practical;

public class Practical_7 {
	
	
public static void main(String[] args) {
        
        double km = 500;  // distance in kilometers

        double meters = km * 1000;        
        double feet = km * 3280.84;       
        double inches = km * 39370.1;     
        double cm = km * 100000;          

        // Using printf for neat formatting (%,.2f = commas + 2 decimals)
        System.out.printf("Distance in kilometers: %.0f km%n", km);
        System.out.printf("Distance in meters: %,.0f m%n", meters);
        System.out.printf("Distance in feet: %,.2f ft%n", feet);
        System.out.printf("Distance in inches: %,.2f in%n", inches);
        System.out.printf("Distance in centimeters: %,.0f cm%n", cm);
    }

}
