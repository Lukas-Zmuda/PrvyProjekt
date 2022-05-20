package edu.oop.banka;

public class App {

	public static void main(String[] args) {

		Osoba o = new Osoba("Fero", "Mravec", "f.mravec@elct.sk");
		//System.out.println(o);
		
		Transakcia t = new Transakcia("vklad", 10);
		//System.out.println(t);
		
		Ucet u = new Ucet(500, "SK4581800000000123456789", o);
		u.vklad(300);
		u.vyber(100);
		u.vklad(1000);
		
		//System.out.println(u.pocetTransakcii());
		
		//System.out.println(u.transakcieNaUcte());
		
		u.kompletInfo();
		
		System.out.println(u.najvaciaTransakcia());
		
		Ucet u2 = new Ucet(15000, "SK770900000000456789123", new Osoba("Ivan", "Hrozny", "ih@hrozny.sk"));
		
		Banka b = new Banka("Moja Banka");
		
		b.pridajUcet(u);
		b.pridajUcet(u2);
		
		System.out.println(b.bonitnyKlient());
		

	}

}
