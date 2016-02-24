import java.lang.*;

public class oefening2 {
	public static void main ( String args[] ) {
		String[] arrayString = {"zondag","maandag","dinsdag","woensdag","donderdag","vrijdag","zaterdag"};
		int a;
		int b = 0;

		for( a = 1; a < 29; a++ ) {
			if ( b == 0 ) System.out.println( arrayString[b] + ", " + a + " februari 2009");
			if ( b == 1 ) System.out.println( arrayString[b] + ", " + a + " februari 2009");
			if ( b == 2 ) System.out.println( arrayString[b] + ", " + a + " februari 2009");
			if ( b == 3 ) System.out.println( arrayString[b] + ", " + a + " februari 2009");
			if ( b == 4 ) System.out.println( arrayString[b] + ", " + a + " februari 2009");
			if ( b == 5 ) System.out.println( arrayString[b] + ", " + a + " februari 2009");
			if ( b == 6 ) {
				System.out.println( arrayString[b] + ", " + a + " februari 2009");
				b = 0;
			}
			
			b++;
		}
	}
}