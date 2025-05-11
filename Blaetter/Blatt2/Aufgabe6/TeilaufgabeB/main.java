public class Main {
	public static void main(String[] args) {
		;
	}
}

public class Tier {
	String name;
	int alter;
	int gewicht;

	public Tier(String name, int alter, int gewicht) {
		this.name = name;
		this.alter = alter;
		this.gewicht = gewicht;
	}

	public String getName() {
		return this.name;
	}

	public int getAlter() {
		return this.alter;
	}

	public int getGewicht() {
		return this.gewicht;
	}

	public void setName(String name) {
		if (this.checkName(name)) {
			this.name = name;
		}
	}

	public void setAlter(int alter) {
		if (this.checkAlter(alter)) {
			this.alter = alter;
		}
	}

	public void setGewicht(int gewicht) {
		if (this.checkGewicht(gewicht)) {
			this.gewicht = gewicht;
		}
	}

	public boolean checkName(String name) {
		// Soll `False` zueruckgeben, falls `name` leer ist, ansonsten ist der
		// `return`-Wert `true`
		return name;
	}
	
	public boolean checkAlter(int alter) {
		return alter > 0;
	}

	public boolean checkGewicht(int gewicht) {
		return gewicht > 0;
	}

	public boolean isLight() {
		return gewicht < 5;
	}
}


// Frage: Gibt es einen grossen Unterscheid in Java zwischen this.Methode() bzw. this.Attribut zu nutzen, statt Methode() bzw. Attribut() "direkt" zu verwenden?
