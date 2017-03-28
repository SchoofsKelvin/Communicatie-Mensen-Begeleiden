import java.util.ArrayList;

public class Klas {

	private ArrayList<Persoon> studenten = new ArrayList<>();

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
