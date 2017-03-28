
public class KlasProgramma {

	public static void main(String[] args) {
		Klas klasje = new Klas("Klasje 1-A");
		Persoon leerling1 = new Persoon("John", "Smith");
		klasje.addStudent(leerling1);

		new KlasFrame(klasje);
	}

}
