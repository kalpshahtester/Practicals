package Practical;

public class Practical_10 {

public static void main(String[] args) {
        
        // Rectangle data
        double length = 15;
        double breadth = 20;

        // Circle data
        double radius = 15;

        // Rectangle calculations
        double rectArea = length * breadth;
        double rectPerimeter = 2 * (length + breadth);

        // Circle calculations
        double circleArea = Math.PI * radius * radius;
        double circleCircumference = 2 * Math.PI * radius;

        // Output
        System.out.println("Rectangle:");
        System.out.println("Area = " + rectArea);
        System.out.println("Perimeter = " + rectPerimeter);

        System.out.println();
        
        System.out.println("Circle:");
        System.out.printf("Area = %.2f\n", circleArea);
        System.out.printf("Circumference = %.2f\n", circleCircumference);
    }
}
