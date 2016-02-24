import java.lang.*;

/**
* De klasse EersteProg is een Java applicatie
*
* @author Lander Verschueren
*
* @version 1.0
*/

public class EersteProg {

	/**
	* Dit is de main functie, hier start het programma en wordt de functie 'drukaf' opgeroepen en wordt er een parameter meegegeven (in dit geval 100).
	*@param args[] array van strings, parameters vanuit de commandline worden hier meegegeven.
	*/
	public static void main( String args[] ) {
		drukaf(100);
	}

	/**
	* Deze functie krijgt een parameter 'm' binnen, in dit geval is dat 100 en de getallen van 0 tot en met 99 zullen afgedrukt worden in de terminal.
	*/
	public static void drukaf( int m ) {
		int a;
		for ( a = 0; a < m; a++ ) {
			System.out.println( a );
		}
	}
}