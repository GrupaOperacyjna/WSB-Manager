/*
 * kapat@kapat.pl
 */
package WSBManager;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import java.awt.event.ActionListener;

public class MenuBar extends JMenuBar implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static String strWindow = "Records";
	private static String strADD = "Add new Record";
	private static String strDEL = "Delete selected record";
	private static String strFile = "File";
	private static String strExport = "Export File to csv";
	private static String strOpenDB = "Open existing database";
	private static String strAbout = "About us...";
	private JMenu jmenuRecords;
	private JMenu jmenuFile;
	private JMenuItem jmADD;
	private JMenuItem jmDEL;
	private WSBManager app;

	public MenuBar(WSBManager app) {
		this.app = app;
		
		jmenuFile = new JMenu(strFile);
		JMenuItem jmenuOpenDB = new JMenuItem(strOpenDB);
		JMenuItem jmenuFileExport = new JMenuItem(strExport);
		jmenuFileExport.addActionListener(this);

		jmenuFile.add(jmenuFileExport);
		jmenuFile.add(jmenuOpenDB);

		add(jmenuFile);

		// RECORDS

		jmenuRecords = new JMenu(strWindow);
		jmenuRecords.setMnemonic(KeyEvent.VK_R);

		jmADD = new JMenuItem(strADD);
		jmDEL = new JMenuItem(strDEL);

		jmADD.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		jmDEL.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));

		jmADD.addActionListener((ActionListener) this);
		jmDEL.addActionListener((ActionListener) this);
		jmenuRecords.add(jmADD);
		jmenuRecords.add(jmDEL);
		add(jmenuRecords);
		add(about());

	}

	public JMenu about() {
		JMenu jmenuAbout = new JMenu(strAbout);
		JMenuItem jmenuAboutUs = new JMenuItem(strAbout);
		jmenuAboutUs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
		jmenuAboutUs.addActionListener((ActionListener) this);
		jmenuAbout.add(jmenuAboutUs);
		return jmenuAbout;
	}

	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		System.out.println(s);

		// Dodawanie nowego rekordu
		if (s.equals(MenuBar.strADD)) {
			String msg = "The option will come soon ...";
			JOptionPane.showMessageDialog(app, msg, "", JOptionPane.INFORMATION_MESSAGE);
//			app.getTableModel().addRow(new Books());
		}

//		ToDo: Opcja zosta³a wy³¹czona bo narazie nie ma klass i nie wiem jak bedzie wygladaæ TableModel;
//		if (!app.getBooks().isEmpty()) {
			if (s.equals(MenuBar.strDEL)) {
				String msg = "The option will come soon ...";
				JOptionPane.showMessageDialog(app, msg, "", JOptionPane.INFORMATION_MESSAGE);
				
//				System.out.println("Sellected row: " + app.getTable().getSelectedRow());
//				if (app.getTable().getSelectedRow() != -1) {
//					app.getTableModel().deleteRow(app.getBooks().get(app.getTable().getSelectedRow()));
//					;
//				} else {
//					JOptionPane.showMessageDialog(app, "Nie zaznaczono nic :(", "", JOptionPane.WARNING_MESSAGE);
//				}
//
			}
//		} 

		if (s.equals(MenuBar.strAbout)) {
			String msg = "Authors:  \n"
					+ "@Kinga  ----> First Lady in the Group\n"
					+ "@Patryk ----> Star Traveler\n"
					+ "@Tomek  ----> Sleepyhead\n";

			JOptionPane.showMessageDialog(app, msg, "", JOptionPane.INFORMATION_MESSAGE);

		}
		
		if (s.equals(MenuBar.strExport)) {
			String msg = "The option will come soon ...";
			JOptionPane.showMessageDialog(app, msg, "", JOptionPane.INFORMATION_MESSAGE);
		}

	}

}
