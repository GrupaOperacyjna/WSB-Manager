/*
 * kapat@kapat.pl
 */

package WSBManager;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import WSBManager.Authors;

public class WSBManager extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String appName = "WSB Manager";
	private JScrollPane spane;
	private JTable table;
	private String[] colName = { "Born", "Name", "Surname" };
//	private List<Books> books;
	private List<Authors> books;
	private TableModelBooks tableModel;
	private String property;

	public WSBManager() {
		initArrayList();
		initComponents();
		showGUI();
	}

	public List<Authors> getBooks() {
		return books;
	}

	public JTable getTable() {
		return table;
	}

	public TableModelBooks getTableModel() {
		return tableModel;
	}

	public void initArrayList() {
		//TODO: Tu bedzie przeglad naszej bazy :D
		books = new ArrayList<Authors>();
//		books = new ArrayList<Books>();
//		books.add(new Books(2020, "Test imie", "Test Nazwisko"));
//		books.add(new Books("B", "B2", 100, "/home/kpt/Dropbox/Programowanie/GUI7_KT_S14320/src/zad3/img.jpg"));
	    books.add(new Authors(2020, "Test", "Test surname"));
	}

	/**
	 * Inicjalizacja Komponentów
	 */
	public void initComponents() {
		tableModel = new TableModelBooks(books, colName);
		table = new JTable(tableModel);
		spane = new JScrollPane(table);
	}

	public void setDtm(TableModelBooks tableModel) {
		this.tableModel = tableModel;
	}

	private void showGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(800, 600));
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setTitle(appName);
		setLayout(new BorderLayout());
		add(spane, BorderLayout.CENTER);
		setJMenuBar(new MenuBar(this));
		pack();
		setVisible(true);
		setLocationRelativeTo(null);
	}

}