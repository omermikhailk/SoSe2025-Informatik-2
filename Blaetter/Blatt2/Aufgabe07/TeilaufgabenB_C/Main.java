class Main {
	// Ich weiss, dass in beide dieser Aufgabe und die letzte, sollte man eine PostStation
	// und PetHotel Klasse erstellen, mit alles was aktuell in meiner Main Methode steht.
	// Aber ich weiss nicht, wie man sowas schafft, ohne mehrere Dateien zu nutzen.
	public static void main(String[] args) {
		Package p1 = new Package("Max Mustermann", 2, false);
		Package p2 = new Package("Jane Doe", 0.75, true);
		p1.setIsSentStatus();
		
		double costOfp1 = p1.getTotalPrice();
		double costOfp2 = p2.getTotalPrice();
		System.out.println("p1: " + costOfp1 + ", p2: " + costOfp2);
	}
}

class Package {
	String receiver;
	double weight;
	boolean isSentStatus;

	private double basePrice = 1.5;

	public Package(String receiver, double weight, boolean isSentStatus) {
		this.receiver = receiver;
		this.weight = weight;
		this.isSentStatus = isSentStatus;
	}

	public String getReceiver() {
		return this.receiver;
	}

	public boolean checkReceiver(String receiver) {
		return Boolean.valueOf(receiver);
	}

	public void setReceiver(String receiver) {
		if (this.checkReceiver(receiver)) {
			this.receiver = receiver;
		}
	}

	public double getWeight() {
		return this.weight;
	}

	public boolean checkWeight(double weight) {
		return weight > 0;
	}

	public void setWeight(double weight) {
		if (this.checkWeight(weight)) {
			this.weight = weight;
		}
	}

	public boolean getIsSentStatus() {
		return this.isSentStatus;
	}

	public void setIsSentStatus() {
		// Habe keine `check` Methode hier benutzt, denn es sollte ziemlich einfach
		// sein, ohne Moeglichkeiten von Fehlern vom Nutzer
		this.isSentStatus = !(this.isSentStatus);
	}

	public double getBasePrice() {
		return basePrice;
	}

	public double getTotalPrice() {
		if (this.getWeight() < 0.5) {
			return basePrice;
		}
		else if (this.getWeight() < 1) {
			return 2 * basePrice;
		}
		else {
			return 5 * basePrice;
		}
	}
}
