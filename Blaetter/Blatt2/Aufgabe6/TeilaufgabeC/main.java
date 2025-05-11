class Main {
	public static void main(String[] args) {
		Tier p1 = new Tier("Luna", 3, 4.2);
		Tier p2 = new Tier("Max", 5, 6.8);

		p2.setGewicht(p2.getGewicht() - 2);

		if (p1.isLight()) {
			System.out.println(p1.getName() + " ist leicht!");
			System.out.println(p1.toString());
		}
		if (p2.isLight()) {
			System.out.println(p2.getName() + " ist leicht!");
			System.out.println(p2.toString());
		}
	}
}

class Tier {
	String name;
	int alter;
	double gewicht;

	public Tier(String name, int alter, double gewicht) {
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

	public double getGewicht() {
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

	public void setGewicht(double gewicht) {
		if (this.checkGewicht(gewicht)) {
			this.gewicht = gewicht;
		}
	}

	public boolean checkName(String name) {
		// Soll `False` zueruckgeben, falls `name` leer ist, ansonsten ist der
		// `return`-Wert `true`
		return Boolean.valueOf(name);
	}
	
	public boolean checkAlter(int alter) {
		return alter > 0;
	}

	public boolean checkGewicht(double gewicht) {
		return gewicht > 0;
	}

	public boolean isLight() {
		return gewicht < 5;
	}

	@Override
	public String toString() {
		return "Name: " + this.getName() + ", Alter: " + this.getAlter() + ", and Gewicht: " + this.getGewicht() + ".";
	}
}
