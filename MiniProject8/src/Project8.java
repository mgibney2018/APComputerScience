// Project 8
// Matthew Gibney
// Creates a Farenheit to Celcius conversion calculator

// Get Scanner
import java.util.Scanner;

public class Project8 {

	public static void main(String[] args) {
	// Establish scanner and variables
	Scanner in = new Scanner(System.in);
	double Farenheit;
	double Celcius;
	
	// User input
	System.out.println("Enter degrees Farenheit: ");
	Farenheit = in.nextDouble();
	
	// Conversion
	Celcius = (Farenheit - 32.0) * 5.0/9.0;
	
	//Close scanner
	in.close();
	
	//Final result
	System.out.println("Degrees celcius = " + Celcius);
	
	}

}
