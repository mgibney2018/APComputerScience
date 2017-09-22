import java.util.Scanner;

public class Project2_3 {

	public static void main(String[] args) {
		
		// Establish Scanner and Variables
		Scanner in = new Scanner(System.in);
		double kilometers;
		double nauticalMiles;
		
		// Get info
		System.out.println("How many kilometers are there? ");
		kilometers = in.nextDouble();
		
		// Conversions
		nauticalMiles = kilometers * 0.539957;
		
		// Close Scanner
		in.close();
		
		// Final Result
		System.out.println("There are " + nauticalMiles + " nautical miles in " + kilometers + " kilometers.");
		
	}

}
