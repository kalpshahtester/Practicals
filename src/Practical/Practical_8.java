package Practical;

public class Practical_8 {
	
	public static void main(String[] args) {
        // Marks (out of 100 each)
        int math = 62;
        int science = 74;
        int english = 85;
        int socialScience = 41;
        int hindi = 63;

        // 1) Aggregate (total)
        int total = math + science + english + socialScience + hindi; // 325

        // 2) Percentage
        int maxTotal = 5 * 100;                 // 500
        double percentage = (total * 100.0) / maxTotal; // 65.0

        // Output
        System.out.println("Aggregate (Total) Marks: " + total + " / " + maxTotal);
        System.out.printf("Percentage: %.2f%%\n", percentage);
    }
}
