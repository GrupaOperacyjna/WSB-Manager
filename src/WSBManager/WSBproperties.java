package WSBManager;

<<<<<<< HEAD
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
 * @author Tomek
 * @since 2020-03-25
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
=======
import java.util.Properties;

// lub poprzesz dziedziczenie z klasy nadrzendej
public class WSBproperties {
	// Deklaracja zmiennych
	private Properties prop; // wtedy prop jest nie potrzebne dostep jest
	// bezpoœrenido getProperty() setPropery()

	// Konstruktor domyœlny
	public WSBproperties() {
		System.out.println("Konstruktor domyœlny - start");

		// inicjacja zmiennej
		this.prop = new Properties();
	}

	// Tu teraz tworzysz metody WSZYSTKE potrzebne metody
	private void Baza() {
		prop.setProperty("db.name", "baza.sql");
		System.out.println(prop.getProperty("db.name"));
	}

	private void Bazap() {
		prop.setProperty("db.path", "C:/");
		System.out.println(prop.getProperty("db.path"));
	}

	private void cover() {
		prop.setProperty("cover.path", "C:/");
		System.out.println(prop.getProperty("cover.path"));
	}

	private void folder() {
		prop.setProperty("db.folder", "C:/");
		System.out.println(prop.getProperty("db.folder"));
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	// Do testowania klsasy - TYLKO DO TESTOWANIA
	public static void main(String[] args) {
		WSBproperties wsb = new WSBproperties();
		wsb.prop.setProperty("test", "test");
		System.out.println(wsb.prop.getProperty("test"));
	}

	}
>>>>>>> refs/remotes/origin/master
