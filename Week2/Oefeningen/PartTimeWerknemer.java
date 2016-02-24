import java.lang.*;

public class PartTimeWerknemer extends Werknemer {
	public int urenGewerkt;

	public PartTimeWerknemer( String voornaam, String achternaam, int wNummer, float salaris, int urenGw ) {
		super( voornaam, achternaam, wNummer, salaris );
		this.urenGewerkt = urenGw;
	}

	public void salarisVerhogen( int percentage ) {
		if ( percentage > 5 ) {
			System.err.println( "Fout: PartTimeWerknemer kunnen slechts 5% opslag krijgen!" );
		}
		else {
			super.salarisVerhogen( percentage );
		}
	}

	public float getWeekLoon() {
		return this.salaris * (float)this.urenGewerkt;
	}
}