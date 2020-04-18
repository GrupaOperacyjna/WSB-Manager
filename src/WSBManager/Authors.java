/*
 * Kinga
 */
package WSBManager;
/**
 * 
 * Obiekt <code>Authors</code> reprezentuje autorow ksiazek. 
 * Obiekt tej klasy zbiera i przechowuje podstawowe informacje, takie jak: imie, nazwisko i data urodzenia autora.
 */
public class Authors {
	/**
	 * Zmienne przechowujace dane autora.
	 */
	private int born;
	private String name;
	private String surname;
	
	/**
	 * Metoda pobiera date urodzenia.
	 * @return Zwraca date urodzenia.
	 */
	public int getBorn() {
		return born;
	}
	/**
	 * Metoda przypisujaca date urodzenia do obiektu.
	 * @param born - ustawia date urodzenia.
	 */
	public void setBorn(int born) {
		this.born = born;
	}
	/**
	 * Metoda pobiera imie autora.
	 * @return zwraca imie autora.
	 */
	public String getName() {
		return name;
	}
	/**
	 * Metoda przypisujaca imie autora do obiektu.
	 * @param name ustawia imie autora.
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
	 * Metoda przypisujaca nazwisko autora do obiektu.
	 * @param surname ustawia nazwisko.
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	/**
	 * Konstruktor domyslny
	 */
	public Authors() {
		this.born=0;
		this.name="Empty Name";
		this.surname="Empty Surname";
	}
	/**
	 * Konstruktor tworzacy obiekt Authors z data urodzenia, imieniem i nazwiskiem.
	 * @param born ustawia date urodzenia.		
	 * @param name ustawia imie autora.
	 * @param surname ustawia nazwisko autora.
	 */

	public Authors(int born, String name, String surname) {
		this.born=born;	
		this.name=name;
		this.surname=surname;
	}
	/**
	 * Metoda zwracajaca wszystkie dane w obiekcie String.
	 */
	@Override
	public String toString() {
		return "[" + born + "]-" + name + "-" + surname;
	}
}