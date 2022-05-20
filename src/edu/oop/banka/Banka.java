package edu.oop.banka;

import java.util.ArrayList;

public class Banka {
	
	private String nazov;
	private ArrayList<Ucet> ucty;
	
	public Banka(String nazov) {
		this.nazov = nazov;
		this.ucty = new ArrayList<Ucet>();
	}

	public String getNazov() {
		return nazov;
	}

	public void pridajUcet(Ucet ucet) {
		this.ucty.add(ucet);
	}
	
	public void vymazUcet(String cislo) {
		int index = -1;
		for(int i = 0; i < ucty.size(); i++) {
			if(ucty.get(i).getCislo().equals(cislo)) {
				index = i;
			}
		}
		if(index > -1) {
			this.ucty.remove(index);
		}else {
			System.out.println("Ucet cislo: " + cislo + " neexistuje!");
		}
	}
	
	public Osoba bonitnyKlient() {
		Ucet max = this.ucty.get(0);
		for(Ucet u: this.ucty) {
			if(u.getZostatok() > max.getZostatok()) {
				max = u;
			}
		}
		return max.getVlastnik();
	}
	
}
