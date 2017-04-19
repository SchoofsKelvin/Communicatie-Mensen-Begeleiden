package oplossing;

public class KlasProgramma {

	public final static KlasFrame venster = new KlasFrame();

	public void toonKlas(Klas klas) {
		venster.clearStudents();
		for (Persoon student : klas.getStudenten()) {
			venster.addStudent(student);
		}
	}

	public static void main(String[] args) {

	}

}
