package oplossing;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

public class KlasFrame {

	private JFrame						window;
	private JList<Person>				list;
	private DefaultListModel<Person>	model	= new DefaultListModel<>();

	public KlasFrame() {
		window = new JFrame("Klasprogramma");

		list = new JList<>(model);
		window.add(list);

		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.validate();
		window.setSize(800, 450);
		window.setVisible(true);
	}

	public void addStudent(Person persoon) {
		model.addElement(persoon);
	}

	public void clearStudents() {
		model.clear();
	}

}
