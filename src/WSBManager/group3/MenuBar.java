/*
 * kapat@kapat.pl
 */
package WSBManager.group3;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class MenuBar extends JMenuBar {
	private static String strWindow = "Records";
	public static String strADD = "Add new Record";
	public static String strDEL = "Delete selected record";
	private static String strFile = "File";
	private JMenu mWindows;
	private JMenuItem jmADD;
	private JMenuItem jmDEL;

	public MenuBar(AppFrame app) {
		new JMenu(strFile);
		mWindows = new JMenu(strWindow);
		mWindows.setMnemonic(KeyEvent.VK_R);

		jmADD = new JMenuItem(strADD);
		jmDEL = new JMenuItem(strDEL);

		jmADD.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		jmDEL.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));

		jmADD.addActionListener(new ALMenu(app));
		jmDEL.addActionListener(new ALMenu(app));
		mWindows.add(jmADD);
		mWindows.add(jmDEL);
		add(mWindows);
	}

}
