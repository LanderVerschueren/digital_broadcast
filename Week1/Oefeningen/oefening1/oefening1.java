import java.lang.*;

public class oefening1 {
	public static void main ( String args[] ) {
		int a;
		int b;

		for( a = 1; a < 10; a++ ) {
			for( b = 1; b < 10; b++) {
				System.out.println( a + "x" + b + "=" + ( a*b ) );
			}
		}
	}
}