package edu.oop.zaklady;

public class App {

	public static void main(String[] args) {
		
		Osoba os = new Osoba();
		
		os.meno = "Maja";
		os.priezvisko = "Vcela";
		os.vek = 69;
		os.pohlavie = 'z';
		
		os.pozdrav();
		
		Obdlznik ob = new Obdlznik();
		ob.d = 12;
		ob.s = 10;
		System.out.println(ob.obsah());
		System.out.println(ob.obvod());
		System.out.println(ob.jeStvorec());
		
		Ucet u = new Ucet();
		u.cislo = "SK115600000000123456789";
		u.zostatok = 1200;
		u.info();
		
		u.vklad(-300);
		u.vyber(500);
		u.info();
	}

}
