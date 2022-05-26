package edu.oop.kompozicia;

public class Autor {
	
	private String meno;
	private String priezvisko;
	private String email;
	private String krajina;
	private String jazyk;
	
	public Autor(String meno, String priezvisko, String email) {
		super();
		this.meno = meno;
		this.priezvisko = priezvisko;
		this.email = email;
	}

	public String getMeno() {
		return meno;
	}

	public void setMeno(String meno) {
		this.meno = meno;
	}

	public String getPriezvisko() {
		return priezvisko;
	}

	public void setPriezvisko(String priezvisko) {
		this.priezvisko = priezvisko;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Autor [meno=" + meno + ", priezvisko=" + priezvisko + ", email=" + email + ", krajina=" + krajina
				+ ", jazyk=" + jazyk + "]";
	}

	public static Autor slovensky(String meno, String priezvisko, String email) {
		Autor svk = new Autor(meno, priezvisko, email);
		svk.krajina = "Slovensko";
		svk.jazyk = "slovensky";
		return svk;
	}
	
	public static Autor cesky(String meno, String priezvisko, String email) {
		Autor svk = new Autor(meno, priezvisko, email);
		svk.krajina = "Cesko";
		svk.jazyk = "cesky";
		return svk;
	}

}
