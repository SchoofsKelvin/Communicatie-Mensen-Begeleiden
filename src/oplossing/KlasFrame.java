package oplossing;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

public class KlasFrame {

	private JFrame						window;
	private JList<Persoon>				list;
	private DefaultListModel<Persoon>	model	= new DefaultListModel<>();

	public KlasFrame() {
		window = new JFrame("Klasprogramma");

		list = new JList<>(model);
		window.add(list);

		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.validate();
		window.setSize(800, 450);
		window.setVisible(true);
	}

	public void addStudent(Persoon persoon) {
		model.addElement(persoon);
	}

	public void clearStudents() {
		model.clear();
	}

}
