// Program 10
// Matthew Gibney
// Tells the user a recommended weight for their height (both male and female)

// Get Scanner
import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
	// Establish scanner and variables
	Scanner in = new Scanner(System.in);
	int Height;
	int MaleWeight;
	int FemaleWeight;
	
	// User input
	System.out.println("Please enter a height in inches: ");
	Height = in.nextInt();
	
	// Conversions
	MaleWeight = 106 + 7 * (Height - 60);
	FemaleWeight = 100 + 6 * (Height - 60);
	
	//Close scanner
	in.close();
	
	//Final result
	System.out.println();
	System.out.println("Recommended Male Weight: " + MaleWeight);
	System.out.println("Recommended Female Weight: " + FemaleWeight);
	
	}

}
