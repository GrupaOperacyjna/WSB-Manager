/*
 * kapat@kapat.pl
 */
package WSBManager;

import java.util.Properties;
import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new WSBManager();
//				Properties prop = new WSBproperties().getProp();
//				Sqlconnector sql = new Sqlconnector(prop);
			}
		});
	}
}