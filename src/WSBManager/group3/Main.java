/*
 * kapat@kapat.pl
 */
package WSBManager.group3;

import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new AppFrame();
			}
		});
	}
}
