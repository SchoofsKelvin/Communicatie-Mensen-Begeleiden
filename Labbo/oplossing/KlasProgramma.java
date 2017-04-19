package oplossing;

public class KlasProgramma {

	public final static KlasFrame venster = new KlasFrame();

	public static void toonKlas(Klas klas) {
		venster.clearStudents();
		for (Persoon student : klas.getStudenten()) {
			venster.addStudent(student);
		}
	}

	public static void main(String[] args) {
		Klas klasje = new Klas("6B");
		klasje.addStudent(new Persoon("Jantje", "Peeters"));
		klasje.addStudent(new Persoon("Bob", "Bobbers"));
		toonKlas(klasje);
	}

}
