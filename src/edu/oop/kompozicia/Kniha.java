package edu.oop.kompozicia;

public class Kniha {
	
	private String nazov;
	private int naklad;
	private Autor[] autori;
	
	public Kniha(String nazov, int naklad, Autor[] autori) {
		super();
		this.nazov = nazov;
		this.naklad = naklad;
		this.autori = autori;
	}

	public String getNazov() {
		return nazov;
	}

	public void setNazov(String nazov) {
		this.nazov = nazov;
	}

	public int getNaklad() {
		return naklad;
	}

	public void setNaklad(int naklad) {
		this.naklad = naklad;
	}

	public Autor[] getAutori() {
		return autori;
	}

	public void setAutori(Autor[] autori) {
		this.autori = autori;
	}

	public int pocetAutorov() {
		return autori.length;
	}
	
	public String autoriKnihy() {
		String str = "";
		for(Autor a: this.autori) {
			str += a + "\n";
		}
		return str;
	}
	
	
	
	
	

}
