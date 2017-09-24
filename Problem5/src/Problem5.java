// Program 5
// Matthew Gibney
// Makes a design using stars 

public class Problem5 {

	public static void main(String[] args) {
		horizontals();
		fiveStarDesign();
		System.out.println();
		horizontals();
		fiveStarDesign();
		horizontals();
		System.out.println();
		threeVerticalStars();
		horizontals();
		fiveStarDesign();

	}

	// Two horizontal star lines
	public static void horizontals() {
		System.out.println("*****");
		System.out.println("*****");
	}
	
	// Five star design
	public static void fiveStarDesign() {
		System.out.println(" * * ");
		System.out.println("  *  ");
		System.out.println(" * * ");
	}
	
	// Three vertical stars
	public static void threeVerticalStars() {
		System.out.println("  *  ");
		System.out.println("  *  ");
		System.out.println("  *  ");
	}
}
