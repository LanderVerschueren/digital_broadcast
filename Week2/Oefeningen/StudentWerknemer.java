import java.lang.*;

public class StudentWerknemer extends PartTimeWerknemer {
	private float RSZpercentage = 5.0f;

	public StudentWerknemer( String voornaam, String achternaam, int wNummer, float salaris, int urenGw ) {
		super( voornaam, achternaam, wNummer, salaris, urenGw );
		setRSZ(RSZpercentage);
	}
}