// Program 8
// Matthew Gibney
// Creates a Farenheit to Celcius conversion calculator

// Get Scanner
import java.util.Scanner;

public class Project8 {

	public static void main(String[] args) {
	// Establish scanner and variables
	Scanner in = new Scanner(System.in);
	double Radius;
	double Diameter;
	double SurfaceArea;
	double Volume;
	
	// User input
	System.out.println("Enter sphere's radius: ");
	Radius = in.nextDouble();
	
	// Conversions
	Diameter = Radius * 2.0;
	SurfaceArea = 4 * 3.14 * Radius * Radius;
	Volume = 3.14 * Radius * Radius * Radius * 4/3;
	
	//Close scanner
	in.close();
	
	//Final result
	System.out.println("Diameter = " + Diameter);
	System.out.println("Surface Area = " + SurfaceArea);
	System.out.println("Volume = " + Volume);
	
	}

}
