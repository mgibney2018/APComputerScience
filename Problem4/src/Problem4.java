// Program 4
// Matthew Gibney
// Types "Hello World" inside of a design

public class Problem4 {

	public static void main(String[] args) {
		points();
		box();
		horizontal();
		System.out.println("|Hello |");
		System.out.println("| World|");
		horizontal();
		box();
		points();
		
	}

	// Method for the pointy parts of the design
	public static void points() {
		System.out.println("   /\\  ");
		System.out.println("  /  \\ ");
		System.out.println(" /    \\");
		
	}
	
	// Methods for the horizontals of the box part of the design
	public static void horizontal() {
		System.out.println("+------+");
	
		}
		
	// Methods for the verticals of the box part of the design
	public static void vertical() {
		System.out.println("|      |");
			
		}
	// Methods for the box part of the design
	public static void box() {
		horizontal();
		vertical();
		vertical();
		horizontal();
	}
	
	
}