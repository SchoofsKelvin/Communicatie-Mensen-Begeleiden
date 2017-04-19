package student;

import oplossing.KlasFrame;

public class KlasProgramma {

	public final static KlasFrame venster = new KlasFrame();

	public static void toonKlas(Klas klas) {
		venster.clearStudents();
		for (Persoon student : klas.getStudenten()) {
			venster.addStudent(student);
		}
	}

	public static void main(String[] args) {

	}

}
