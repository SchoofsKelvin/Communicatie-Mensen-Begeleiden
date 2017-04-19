package oplossing;
import java.util.ArrayList;

public class Klas {

	private String				naam;
	private ArrayList<Persoon>	studenten	= new ArrayList<>();

	public Klas(String naam) {
		this.naam = naam;
	}

	public String getNaam() {
		return naam;
	}

	public void addStudent(Persoon persoon) {
		studenten.add(persoon);
	}

	public void removeStudent(Persoon persoon) {
		studenten.remove(persoon);
	}

	public Persoon[] getStudenten() {
		return studenten.toArray(new Persoon[studenten.size()]);
	}

}
