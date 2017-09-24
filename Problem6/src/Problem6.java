// Program 6
// Matthew Gibney
// Makes a design using stars and lines

public class Problem6 {

	public static void main(String[] args) {
		fiveHorizontalStars();
		twoHorizontalStarRows();
		System.out.println();
		fiveHorizontalStars();
		twoHorizontalStarRows();
		starsAndLines();
		System.out.println("*************");
		fiveHorizontalStars();
		twoHorizontalStarRows();
		System.out.println();
		fiveHorizontalStars();
		twoHorizontalStarRows();
		fiveHorizontalStars();
		starsAndLines();
		starsAndLines();
		fiveHorizontalStars();
		fiveHorizontalStars();
		
	}

	// Five horizontal stars
	public static void fiveHorizontalStars() {
		System.out.println("    *****   ");
	}
		
	// Two horizontal star rows
	public static void twoHorizontalStarRows() {
		System.out.println("  *********  ");
		System.out.println("*************");
	}
		
	// Two stars and lines
	public static void starsAndLines() {
		System.out.println("* | | | | | *");
	}
}
