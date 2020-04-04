package WSBManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * Klasa do tworzenie i pobieranie ustawieñ dla programu WSB-Manager
 * 
 * @author Kinga po poprawkach KapatPL
 * @since 2020-04-04
 * @version 0.1
 */
public class WSBproperties {
	private Properties prop;
	/**
	 * Sta³a property PROP_DB_NAME = "db.name";
	 */
	public static final String PROP_DB_NAME = "db.name";
	/**
	 * Sta³a property "db.path";
	 */
	public static final String PROP_DB_PATH = "db.path";
	public static final String PROP_DB_DRIVER = "db.driver";
	/**
	 * 	Sta³a property PROP_COVER_PATH = "cover.path";
	 */
	public static final String PROP_COVER_PATH = "cover.path";

	/**
	 * sta³a nazwa pliku konfiguracyjnego
	 */
	public static String FILE_CONFIG = "settings.conf";

	/**
	 * Konstruktor domyœlny
	 */
	public WSBproperties() {
		String useDirectory = Paths.get("").toAbsolutePath().toString()+"\\";
		FILE_CONFIG = useDirectory+FILE_CONFIG;
	
		File f = new File(FILE_CONFIG);
		
		if(f.exists()) {
			this.prop = loadProperties(FILE_CONFIG);
//			this.prop.forEach((key, value) -> System.out.println("Key : " + key + ", Value : " + value));	
		} else {
			this.prop = generateDefaultsProperties();
			saveProperties(this.prop);
		}
	
	}
	/**
	 * Zwraca Properties dla aplikacji WSB-Manager
	 * @return {@link Properties}
	 */
	public Properties getProp() {
		return prop;
	}


	/**
	 * Metoda wczytuj¹ca  dane z pliku konfiguracyjnego 
	 * @return properties - zwraca properties
	 * 
	 * @see Properties
	 */
	private Properties loadProperties(String config) {
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(FILE_CONFIG));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
	
	
	/**
	 * Metoda zapisuj¹ca domyœlne ustawienia propertues
	 * @param prop
	 */
	private void saveProperties(Properties prop) {
		try (OutputStream output = new FileOutputStream(FILE_CONFIG)){
			prop.store(output, null);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	/**
	 * Klasa generuje domyœlne ustawienia dla aplikacji
	 * @return prop - Properties
	 */
	private Properties generateDefaultsProperties() {
		Properties prop = new Properties();
		prop.setProperty(PROP_DB_NAME, "baza.sql");
		prop.setProperty(PROP_DB_PATH, "database/");
		prop.setProperty(PROP_DB_DRIVER, "sqlite");
		prop.setProperty(PROP_COVER_PATH, "cover/");
		return prop;
	}
}