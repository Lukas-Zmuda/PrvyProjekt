package edu.oop.banka;

import java.util.ArrayList;

public class Ucet implements OperacieSUctom{
	
	private double zostatok;
	private String cislo;
	private Osoba vlastnik;
	private ArrayList<Transakcia> transakcie;
	
	public Ucet(double zostatok, String cislo, Osoba vlastnik) {
		super();
		this.zostatok = zostatok;
		this.cislo = cislo;
		this.vlastnik = vlastnik;
		this.transakcie = new ArrayList<Transakcia>();
		pridajTransakciu("zalozenie", zostatok);
	}

	public double getZostatok() {
		return zostatok;
	}

	public String getCislo() {
		return cislo;
	}

	public Osoba getVlastnik() {
		return vlastnik;
	}

	private void pridajTransakciu(String operacia, double suma) {
		Transakcia tran = new Transakcia(operacia, suma);
		transakcie.add(tran);
	}
	
	private void pridajTransakciu(Transakcia transakcia) {
		transakcie.add(transakcia);
	}
	
	@Override
	public void vklad(double suma) {
		if(suma > 0) {
			this.zostatok += suma;
			this.pridajTransakciu("vklad", suma);
		}else {
			System.out.println("Nepovolena operacia!");
		}
		
	}

	@Override
	public void vyber(double suma) {
		if(suma > 0) {
			if(suma < zostatok) {
				this.zostatok -= suma;
				this.pridajTransakciu(new Transakcia("vyber", suma));
			}else {
				System.out.println("Nedostatok prostriedkov na ucte!");
			}
		}else {
			System.out.println("Nepovolena operacia!");
		}
		
	}
	
	public int pocetTransakcii() {
		return this.transakcie.size();
	}
	
	public String transakcieNaUcte() {
		String vypis = "";
		for(Transakcia t: this.transakcie) {
			vypis += t + "\n";
		}
		return vypis;
	}
	
	public void vymazTransakcie() {
		this.transakcie.clear();
	}
	
	public void kompletInfo() {
		System.out.println("Ucet cislo: " + this.getCislo());
		System.out.println("Zostatok: " + this.getZostatok());
		System.out.println("Vlastnik: " + this.getVlastnik());
		System.out.println("-------------------------");
		System.out.println(this.transakcieNaUcte());
	}
	
	public Transakcia najvaciaTransakcia() {
		Transakcia naj = transakcie.get(0);
		for(Transakcia t: transakcie) {
			if(t.getSuma() > naj.getSuma()) {
				naj = t;
			}
		}
		return naj;
	}

}
