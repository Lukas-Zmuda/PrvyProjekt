package edu.oop.zaklady;

class Osoba {
	
	//vlastnosti
	//instancne premenne (ang.: fields)
	String meno;
	String priezvisko;
	int vek;
	char pohlavie;

	//konstruktory
	Osoba(){
		meno = "nezname";
		priezvisko = "nezname";
		vek = 1;
		pohlavie = 'n';
		//System.out.println("Volany konstruktor bez parametra");
	}
	
	Osoba(String meno, String priezvisko, int vek, char pohlavie){
		if(meno == null) {
			this.meno = "nezname";
		}else {
			this.meno = meno;
		}
		if(priezvisko == null) {
			this.priezvisko = "nezname";
		}else {
			this.priezvisko = priezvisko;
		}
		//this.priezvisko = priezvisko;
		this.vek = vek;
		this.pohlavie = pohlavie;
		System.out.println("Volany konstruktor so vsetkymi parametrami");
	}
	
	Osoba(String meno, String priezvisko){
		this(meno, priezvisko, 2, 'n');
		System.out.println("Volany konstruktor meno priezvisko");
	}
	
	
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
