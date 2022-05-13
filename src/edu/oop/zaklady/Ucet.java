package edu.oop.zaklady;

/**
 * Trieda Ucet
 *  - v instancnych premennych evidujeme zostatok(double), cislo uctu(String)
 *  - metody:
 *  	+ void info() - vypise informacie o ucte v tvare:
 *  		Ucet cislo: xxxxxxxxxxxx
 *  		Zostatok na ucte: xxx
 *  	+ void vklad(double suma) - vlozi sumu na ucet (overit ci suma > 0)
 *  							a vypise info o operacii
 *  	+ void vyber(double suma) - odrata sumu zo zostatku na ucte (ak ma dostatok prostriedkov
 *  							na ucte ) (overit ci suma > 0) a vypise info o operacii
 * @author študent
 *
 */
public class Ucet {
	
	String cislo;
	double zostatok;
	
	void info() {
		System.out.println("Ucet cislo: " + cislo);
		System.out.println("Zostatok na ucte: " + zostatok);
	}
	
	void vklad(double suma) {
		if(suma > 0) {
			zostatok += suma;
			System.out.println("Vklad " + suma + " na ucet. Zostatok: " + zostatok);
		}else {
			System.out.println("Nepovolena operacia! Vklad: " + suma);
		}
	}
	
	void vyber(double suma) {
		if(suma > 0) {
			if(suma < zostatok) {
				zostatok -= suma;
				System.out.println("Vyber " + suma + " z uctu. Zostatok: " + zostatok);
			}else {
				System.out.println("Nepovolena operacia - nedostatok prostriedkov! Vyber: " + suma);
			}
		}else {
			System.out.println("Nepovolena operacia! Vyber: " + suma);
		}
	}

}
