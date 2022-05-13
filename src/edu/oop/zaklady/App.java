package edu.oop.zaklady;

public class App {

	public static void main(String[] args) {
		
		Osoba os = new Osoba();
		
		os.meno = "Maja";
		os.priezvisko = "Vcela";
		os.vek = 69;
		os.pohlavie = 'z';
		
		os.pozdrav();
		
		
	}

}
