import java.lang.*;

public class oefening3 {
	public static void main ( String args[] ) {
		int a;
		int som = 0;

		for ( a = 1; a < 10001; a = a + 2 ) {
			if( a % 2 == 0 ) {
				som +=  ( 1/a );
			}
			else {
				som -= ( 1/a );
			}
		}
		som = som * 4;
		System.out.println(som);
	}
}