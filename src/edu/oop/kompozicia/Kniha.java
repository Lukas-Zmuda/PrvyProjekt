package edu.oop.kompozicia;

public class Kniha {
	
	private String nazov;
	private int naklad;
	private Autor autor;
	
	public Kniha(String nazov, int naklad, Autor autor) {
		super();
		this.nazov = nazov;
		this.naklad = naklad;
		this.autor = autor;
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

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Kniha [nazov=" + nazov + ", naklad=" + naklad + ", autor=" + autor + "]";
	}
	
	
	
	
	

}
