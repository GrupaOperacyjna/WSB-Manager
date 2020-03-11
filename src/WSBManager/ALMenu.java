/*
 * kapat@kapat.pl
 */

package WSBManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ALMenu implements ActionListener {
	private AppFrame app;

	public ALMenu(AppFrame app2) {
		this.app = app2;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		;
		// Dodawanie nowego rekordu
		if (s.equals(MenuBar.strADD)) {
			app.getTableModel().addRow(new Books());
		}

		if (!app.getBooks().isEmpty()) {
			if (s.equals(MenuBar.strDEL)) {
				System.out.println("Sellected row: " + app.getTable().getSelectedRow());
				if (app.getTable().getSelectedRow() != -1) {
					app.getTableModel().deleteRow(app.getBooks().get(app.getTable().getSelectedRow()));
					;
				} else {
					JOptionPane.showMessageDialog(app,
							"Nie zaznaczono nic :(",
							"", JOptionPane.WARNING_MESSAGE);
				}

			}
		} else {
			// Jak jest pusta krzycz :D
			JOptionPane.showMessageDialog(app, "Lista Pusta", "Brak rekordów",
					JOptionPane.WARNING_MESSAGE);
		}

	}

}
