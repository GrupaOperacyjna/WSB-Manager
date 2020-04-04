package WSBManager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

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
	
	private static int top = 5;
	private static int left = 5;
	private static int bottom = 5;
	private static int right = 5;
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
		app.setPreferredSize(new Dimension(250, 150));
		BorderLayout mainBorder = new BorderLayout();
		app.setLayout(mainBorder);

		app.add(authorJPanel(), BorderLayout.CENTER);
		app.add(buttonJPanel(), BorderLayout.PAGE_END);
		

		app.setVisible(true);
		app.setLocationRelativeTo(null);
		app.pack();

	}

	/**
	 * Metoda wywo³uje panel z przyciskami ok, anuluj
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
		panel.setBorder(BorderFactory.createEmptyBorder(top, left, bottom, right));

		jlabelAuthorName = new JLabel("Imiê ", SwingConstants.LEFT);
		jlabelAuthorSurname = new JLabel("Nazwisko ", SwingConstants.LEFT);
		jlabelAuthorBorn = new JLabel("Data urodzenia ",SwingConstants.LEFT);

		panel.setLayout(new GridLayout(3, 1));

		jtfielfAuthorName = new JTextField();
		jtfielfAuthorSurname = new JTextField();
		jtfielfAuthorBorn = new JTextField();

		panel.add(jlabelAuthorName);
		panel.add(jtfielfAuthorName);

		panel.add(jlabelAuthorSurname);
		panel.add(jtfielfAuthorSurname);

		panel.add(jlabelAuthorBorn);
		panel.add(jtfielfAuthorBorn);
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
			if (!(jtfielfAuthorBorn.getText().equals("") || jtfielfAuthorName.getText().equals("")
					|| jtfielfAuthorSurname.getText().equals(""))) {
				Authors test = new Authors(Integer.parseInt(jtfielfAuthorBorn.getText()), jtfielfAuthorName.getText(),
						jtfielfAuthorSurname.getText());
				System.out.println(test);
				this.app.dispose();

			} else {
				//Kolorowanie
				if (jtfielfAuthorBorn.getText().equals("")) {
					jtfielfAuthorBorn.setBackground(Color.RED);
				} else {
					jtfielfAuthorBorn.setBackground(Color.white);
				}

				if (jtfielfAuthorName.getText().equals("")) {
					jtfielfAuthorName.setBackground(Color.RED);
				} else {
					jtfielfAuthorName.setBackground(Color.white);
				}
				
				
				if (jtfielfAuthorSurname.getText().equals("")) {
					jtfielfAuthorSurname.setBackground(Color.RED);
				} else {
					jtfielfAuthorSurname.setBackground(Color.white);
				}
			}
		}

	}

}
