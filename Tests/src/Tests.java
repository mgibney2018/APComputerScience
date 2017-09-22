
public class Tests {

	public static void main(String[] args) {
		int x = 0;
		double y = 5;
		int z = 4;
		
		x+=12;
		x/=y;
		z--;
		z*=x;
		x/=z;

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

}
