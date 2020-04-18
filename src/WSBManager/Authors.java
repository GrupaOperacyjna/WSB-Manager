/*
 * Kinga
 */
package WSBManager;
/**
 * 
 * Obiekt <code>Authors</code> reprezentuje autorów ksi¹¿ek. 
 * Obiekt tej klasy zbiera i przechowuje podstawowe informacje, takie jak: imiê, nazwisko i data urodzenia autora.
 */
public class Authors {
	/**
	 * Zmienne przechowuj¹ce dane autora.
	 */
	private int born;
	private String name;
	private String surname;
	
	/**
	 * Metoda pobiera datê urodzenia.
	 * @return Zwraca date urodzenia.
	 */
	public int getBorn() {
		return born;
	}
	/**
	 * Metoda przypisuj¹ca datê urodzenia do obiektu.
	 * @param born - ustawia datê urodznia.
	 */
	public void setBorn(int born) {
		this.born = born;
	}
	/**
	 * Metoda pobiera imiê autora.
	 * @return zwraca imiê autora.
	 */
	public String getName() {
		return name;
	}
	/**
	 * Metoda przypisuj¹ca imiê autora do obiektu.
	 * @param name ustawia imiê autora.
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
	 * Metoda przypisuj¹ca nazwisko autora do obiektu.
	 * @param surname ustawia nazwisko.
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	/**
	 * Konstruktor domyœlny
	 */
	public Authors() {
		this.born=0;
		this.name="Empty Name";
		this.surname="Empty Surname";
	}
	/**
	 * Konstruktor tworz¹cy obiekt Authors z dat¹ urodzenia, imieniem i nazwiskiem.
	 * @param born ustawia datê urodzenia.		
	 * @param name ustawia imiê autora.
	 * @param surname ustawia nazwisko autora.
	 */

	public Authors(int born, String name, String surname) {
		this.born=born;	
		this.name=name;
		this.surname=surname;
	}
	/**
	 * Metoda zwracaj¹ca wszystkie dane w obiekcie String.
	 */
	@Override
	public String toString() {
		return "[" + born + "]-" + name + "-" + surname;
	}
}