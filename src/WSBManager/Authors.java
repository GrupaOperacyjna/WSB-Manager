/*
 * Kinga
 */
package WSBManager;
/**
 * 
 * Obiekt <code>Authors</code> reprezentuje autor�w ksi��ek. 
 * Obiekt tej klasy zbiera i przechowuje podstawowe informacje, takie jak: imi�, nazwisko i data urodzenia autora.
 */
public class Authors {
	/**
	 * Zmienne przechowuj�ce dane autora.
	 */
	private int born;
	private String name;
	private String surname;
	
	/**
	 * Metoda pobiera dat� urodzenia.
	 * @return Zwraca date urodzenia.
	 */
	public int getBorn() {
		return born;
	}
	/**
	 * Metoda przypisuj�ca dat� urodzenia do obiektu.
	 * @param born - ustawia dat� urodznia.
	 */
	public void setBorn(int born) {
		this.born = born;
	}
	/**
	 * Metoda pobiera imi� autora.
	 * @return zwraca imi� autora.
	 */
	public String getName() {
		return name;
	}
	/**
	 * Metoda przypisuj�ca imi� autora do obiektu.
	 * @param name ustawia imi� autora.
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Metoda pobiera nazwisko autora.
	 * @return zwraca nazwisko autora.
	 */
	public String getSurname() {
		return surname;
	}
	/**
	 * Metoda przypisuj�ca nazwisko autora do obiektu.
	 * @param surname ustawia nazwisko.
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	/**
	 * Konstruktor domy�lny
	 */
	public Authors() {
		this.born=0;
		this.name="Empty Name";
		this.surname="Empty Surname";
	}
	/**
	 * Konstruktor tworz�cy obiekt Authors z dat� urodzenia, imieniem i nazwiskiem.
	 * @param born ustawia dat� urodzenia.		
	 * @param name ustawia imi� autora.
	 * @param surname ustawia nazwisko autora.
	 */

	public Authors(int born, String name, String surname) {
		this.born=born;	
		this.name=name;
		this.surname=surname;
	}
	/**
	 * Metoda zwracaj�ca wszystkie dane w obiekcie String.
	 */
	@Override
	public String toString() {
		return "[" + born + "]-" + name + "-" + surname;
	}
}