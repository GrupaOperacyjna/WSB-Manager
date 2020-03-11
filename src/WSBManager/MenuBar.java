/*
 * kapat@kapat.pl
 */
package WSBManager;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class MenuBar extends JMenuBar {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static String strWindow = "Records";
	public static String strADD = "Add new Record";
	public static String strDEL = "Delete selected record";
	private static String strFile = "File";
	private static String strExport = "Export File to csv";
	private static String strOpenDB = "Open existing database";
	private JMenu jmenuRecords;
	private JMenu jmenuFile;
	private JMenuItem jmADD;
	private JMenuItem jmDEL;

	public MenuBar(AppFrame app) {
		//		File
		jmenuFile = new JMenu(strFile);
		JMenuItem jmenuOpenDB = new JMenuItem(strOpenDB);
		JMenuItem jmenuFileExport = new JMenuItem(strExport);
		
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

		jmADD.addActionListener(new ALMenu(app));
		jmDEL.addActionListener(new ALMenu(app));
		jmenuRecords.add(jmADD);
		jmenuRecords.add(jmDEL);
		add(jmenuRecords);
		
//		new JMenu("aaaaa");
//		add(mWindows);

	}

}
