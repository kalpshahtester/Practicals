package Practical;

public class Practical_6 {

	 public static void main(String[] args) {
	        
	        // 1. What you have (Data)
	        double bs = 50000; // basic salary

	        // 2. Calculations
	        double da = bs * 0.4;   // Dearness Allowance = 40% of bs
	        double hra = bs * 0.2;  // House Rent Allowance = 20% of bs

	        // 3. What the program wants (Gross Salary)
	        double gs = bs + da + hra;

	        // 4. Output
	        System.out.println("Ramesh's Gross Salary is: " + gs);
	
	 }
	
  }
