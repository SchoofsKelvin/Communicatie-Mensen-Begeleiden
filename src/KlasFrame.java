import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KlasFrame extends JFrame {

	private static final long serialVersionUID = 5840472120840766246L;

	public KlasFrame(Klas klas) {
		super("Klasprogramma");

		JLabel header = new JLabel("Klas " + klas.getNaam());
		header.setVisible(true);
		// Canvas canvas = new Canvas();
		JLabel canvas = new JLabel("idk");
		canvas.setVisible(true);

		setLayout(new GridBagLayout());
		GridBagConstraints con = new GridBagConstraints();
		con.fill = GridBagConstraints.HORIZONTAL;
		con.gridheight = 5;
		con.ipadx = 0;
		con.gridy = 0;
		add(header, con);
		con.gridy = 1;
		add(canvas, con);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		validate();
		setSize(800, 450);
		setVisible(true);

		// canvas.getGraphics().drawOval(20, 20, 10, 10);
	}

}
