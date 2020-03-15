/*
 * kapat@kapat.pl
 */
package WSBManager;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class TableModelBooks extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2846447800443659958L;
//	private List<Books> books;
	private List<Authors> books;
	private String[] colName;

	public TableModelBooks() {
//		this.books.add(new Books());
		this.books.add(new Authors());
	}

	public TableModelBooks(List<Authors> authors, String[] colName) {
		this.books = authors;
		this.colName = colName;
	}
//	public TableModelBooks(List<Books> books, String[] colName) {
//		this.books = books;
//		this.colName = colName;
//	}

	/**
	 * Dodaje nowy record
	 * 
	 * @param item
	 */
	
	public void addRow(Authors item) {
		int rowIndex = books.size();
		books.add(item);
		fireTableRowsInserted(rowIndex, rowIndex);
	}

	public void deleteRow(Books item) {
		int rowIndex = books.indexOf(item);
		if (rowIndex > -1) {
			books.remove(item);
			fireTableRowsDeleted(rowIndex, rowIndex);
		}
	}

	@Override
	public int getColumnCount() {
		return colName.length;
	}

	/**
	 * Zwraca Nazwy Kolumn
	 */
	@Override
	public String getColumnName(int column) {
		Object id = null;
		if (column < colName.length && (column >= 0)) {
			id = colName[column];
		}
		return (id == null) ? super.getColumnName(column) : id.toString();
	}

	@Override
	public int getRowCount() {
		return books.size();
	}

	/**
	 * Zwraca Dane z obiektu i estawia w tabeli
	 */
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Object value = null;
		for (int i = 0; i < books.size(); i++) {
			if (columnIndex == 0)
				value = books.get(rowIndex).getBorn();
			if (columnIndex == 1)
				value = books.get(rowIndex).getName();
			if (columnIndex == 2)
				value = books.get(rowIndex).getSurname();
//			if (columnIndex == 3) {
//				value = books.get(rowIndex).getBookImage();
//			}

		}
		return value;
	}

	/*
	 * sprawdza która tabela jest edytowana
	 * 
	 * @see javax.swing.table.AbstractTableModel#isCellEditable(int, int)
	 */
	@Override
	public boolean isCellEditable(int row, int col) {
		return true;
	}

	// TODO: Zapisuje dane w tabeli ;)
	@Override
	public void setValueAt(Object Value, int row, int column) {
		System.out.println("setValueAT: " + Value);
//		books.get(row).setBookAutor(Value.toString());
//		if (column == 0)
//			books.get(row).setBookAutor(Value.toString());
//		if (column == 1)
//			books.get(row).setBookName(Value.toString());
//		if (column == 2)
//			books.get(row).setBookPrice(Float.valueOf(Value.toString()));
//		if (column == 3) {
//			books.get(row).setBookImage(Value.toString());
//		}
	}

}
