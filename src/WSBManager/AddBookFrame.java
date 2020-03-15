package WSBManager;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SpringLayout;

/**
 * Klasa do wy�wietlania menu dodawania ksi�zki do bazy danych
 * 
 * @author Tomasz Kapu�ciarek
 * 
 */
public class AddBookFrame implements ActionListener {
	private JFrame app;
	private JButton jbuttonAccept;
	private JButton jbuttonCancel;

	private JLabel jlabelAuthorName;
	private JLabel jlabelAuthorSurname;
	private JLabel jlabelAuthorBorn;

	private JTextField jtfielfAuthorName;
	private JTextField jtfielfAuthorSurname;
	private JTextField jtfielfAuthorBorn;
	
	/**
	 * Konstruktor Domy�lny
	 */
	public AddBookFrame() {
		generateFrame();
	}
	
	/**
	 * Wywoa�anie Okna Aplikacji
	 */
	public void generateFrame() {
		app = new JFrame();
		app.setTitle("new title");
//		app.setPreferredSize(new Dimension(400, 300));
		BorderLayout mainBorder = new BorderLayout();
		app.setLayout(mainBorder);

		app.add(buttonJPanel(), BorderLayout.PAGE_END);
		app.add(authorJPanel(), BorderLayout.CENTER);

		app.setVisible(true);
		app.setLocationRelativeTo(null);
		app.pack();

	}

	/**
	 * @return zwraca panel z przyciskami dodaj, anuluj
	 */

	// TODO: Dopisa� obs�ug� lisinera.
	private JPanel buttonJPanel() {
		JPanel panel = new JPanel();

		jbuttonAccept = new JButton("Dodaj");
		jbuttonAccept.addActionListener(this);
		;

		jbuttonCancel = new JButton("Anuluj");
		jbuttonCancel.addActionListener(this);

		panel.setLayout(new FlowLayout());
		panel.add(jbuttonAccept);
		panel.add(jbuttonCancel);
		return panel;
	}

	/**
	 * Generuje panel z polami do wype�nienia.
	 * 
	 * @return zwaraca Panel z danymi do uzupe�nienia;
	 */
	private JPanel authorJPanel() {
		JPanel panel = new JPanel();

		jlabelAuthorName = new JLabel("Imi�: ");
		jlabelAuthorSurname = new JLabel("Nazwisko: ");
		jlabelAuthorBorn = new JLabel("Data urodzenia: ");

		panel.setLayout(new GridLayout(3, 1));

		jtfielfAuthorName = new JTextField();
		jtfielfAuthorSurname = new JTextField();
		jtfielfAuthorBorn = new JTextField();

		panel.add(jlabelAuthorName, 0, 0);
		panel.add(jtfielfAuthorName, 0, 1);

		panel.add(jlabelAuthorSurname, 1, 0);
		panel.add(jtfielfAuthorSurname, 1, 1);

		panel.add(jlabelAuthorBorn, 2, 0);
		panel.add(jtfielfAuthorBorn, 2, 1);
		return panel;
	}

//	public static void main(String[] args) {
//		new AddBookFrame();
//
//	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		if (s.equals("Anuluj")) {
			this.app.dispose();
		}

		if (s.equals("Dodaj")) {
			//TODO: Poprawi� testy wywala p��d bo nie s� prowid�owo dane wprowadzone;
			if (jtfielfAuthorBorn.getText().equals(null) || jtfielfAuthorName.getText().equals(null)
					|| jtfielfAuthorSurname.getText().equals(null)) {

			} else {
				Authors test = new Authors(Integer.parseInt(jtfielfAuthorBorn.getText()), jtfielfAuthorName.getText(),
						jtfielfAuthorSurname.getText());
				System.out.println(test);
				this.app.dispose();
			}
		}

	}

}
