import java.lang.*;

public class LesKlassen {
	public static void main ( String args[] ) {
		Werknemer jan;
		jan = new Werknemer( "Jan", "Janssens", 1, 20.0f);
		Werknemer johan = new Werknemer( "Johan", "Moortgat", 2, 50.0f);
		Werknemer piet = new Werknemer( "Piet", "Uytdebroeck", 3, 10.0f);
		Werknemer lander = new Werknemer( "Lander", "Verschueren", 4, 3000000.0f);
		PartTimeWerknemer dieter = new PartTimeWerknemer( "Dieter", "Vercammen" , 5, 2.0f, 2);
		StudentWerknemer anke = new StudentWerknemer( "Anke", "Verschueren", 6, 3.0f, 5 );

		johan.salarisVerhogen(10);

		System.out.println( jan.voornaam + " verdient: " + jan.getSalaris() );
		System.out.println( johan.voornaam + " verdient: " + johan.getSalaris() );
		System.out.println( piet.voornaam + " verdient: " + piet.getSalaris() );
		System.out.println( lander.voornaam + " verdient: " + lander.getSalaris() );
		System.out.println( dieter.achternaam + " verdient: " + dieter.getWeekLoon() );
		System.out.println( anke.achternaam + " verdient: " + anke.getWeekLoon() );
		System.out.println( "Het RSZ percentage van Anke is " + anke.getRSZ() );

		Factuur factuur = new Factuur();

		Betaalbaar[] BetDingen = new Betaalbaar[2];
		BetDingen[0] = jan;
		BetDingen[1] = factuur;

		for ( int i=0; i < 2; i++ ) {
			BetDingen[i].betaal();
		}

		System.out.println( "Aantal werknemers: " + Werknemer.aantalWerknemers );
	}
}