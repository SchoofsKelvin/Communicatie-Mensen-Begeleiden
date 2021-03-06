package oplossing;

public class Persoon implements Person {

	private String	voornaam;
	private String	achternaam;

	public Persoon(String voornaam, String achternaam) {
		this.voornaam = voornaam;
		this.achternaam = achternaam;
	}

	public String getAchternaam() {
		return achternaam;
	}

	public String getVoornaam() {
		return voornaam;
	}

	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	@Override
	public String toString() {
		return voornaam + " " + achternaam;
	}
}
