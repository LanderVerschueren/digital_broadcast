import java.lang.*;

public class Factuur implements Betaalbaar {
	public int factuurNr = 1;
	public int factuurBedrag = 100;

	public void betaal() {
		System.out.println( "Betaal factuur " + factuurNr + " voor een bedrag van " + factuurBedrag );
	}
}