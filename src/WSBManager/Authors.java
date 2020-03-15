/*
 * Kinga
 */
package WSBManager;

public class Authors {
	private int born;
	private String name;
	private String surname;
	
	public int getBorn() {
		return born;
	}

	public void setBorn(int born) {
		this.born = born;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	// Konstruktor domyslny - tamten bez argumentów by³ wywo³ywany domyœlnie
	public Authors(int born, String name, String surname) {
		this.born=born;
		this.name=name;
		this.surname=surname;
	}

	public String toStringoverride() {
		return "[" + born + "]-" + name + "-" + surname;
	}
}