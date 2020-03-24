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
 * Klasa do wyœwietlania menu dodawania ksi¹zki do bazy danych
 * 
 * @author Tomasz Kapuœciarek
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
	 * Konstruktor Domyœlny
	 */
	public AddBookFrame() {
		generateFrame();
	}
	
	/**
	 * Wywoa³anie Okna Aplikacji
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

	// TODO: Dopisaæ obs³ugê lisinera.
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
	 * Generuje panel z polami do wype³nienia.
	 * 
	 * @return zwaraca Panel z danymi do uzupe³nienia;
	 */
	private JPanel authorJPanel() {
		JPanel panel = new JPanel();

		jlabelAuthorName = new JLabel("Imiê: ");
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
			//TODO: Poprawiæ testy wywala p³¹d bo nie s¹ prowid³owo dane wprowadzone;
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
