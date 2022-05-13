package edu.oop.zaklady;

class Osoba {
	
	//vlastnosti
	//instancne premenne (ang.: fields)
	String meno;
	String priezvisko;
	int vek;
	char pohlavie;

	
	//metody
	void pozdrav() {
		System.out.println("Ahoj. Volam sa " + meno + " " +
				priezvisko + ". Mam " + vek + " rokov");
	}
	
	void pozdrav(boolean komplet) {
		if(komplet) {
			System.out.println("Ahoj. Volam sa " + meno + " " +
					priezvisko + ". Mam " + vek + " rokov. Pohlavie: " + pohlavieSlovom());
		}else {
			pozdrav();
		}
	}
	
	String pohlavieSlovom() {
		switch(pohlavie) {
		case 'm':
			return "muz";
		case 'z':
			return "zena";
		case 'n':
			return "neuvedene";
		default:
			return "error";	
		}
	}
	
	
}
