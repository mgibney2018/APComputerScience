// Program 9
// Matthew Gibney
// Creates a calculator for the area of a trapezoid

// Get Scanner
import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
	// Establish scanner and variables
	Scanner in = new Scanner(System.in);
	double Height;
	double LengthBottom;
	double LengthTop;
	double Area;
	
	// User input
	System.out.println("Enter the height of the trapezoid: ");
	Height = in.nextDouble();
	System.out.println("Enter the length of the bottom base: ");
	LengthBottom = in.nextDouble();
	System.out.println("Enter the length of the top base: ");
	LengthTop = in.nextDouble();
	
	// Conversions
	Area = (LengthBottom + LengthTop)/2 * Height;
	
	//Close scanner
	in.close();
	
	//Final result
	System.out.println("The area is = " + Area);
	
	}

}
