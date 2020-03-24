package WSBManager;

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
