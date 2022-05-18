package edu.oop.kompozicia;

public class Autor {
	
	private String meno;
	private String priezvisko;
	private String email;
	
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
		return "Autor [meno=" + meno + ", priezvisko=" + priezvisko + ", email=" + email + "]";
	}
	
	
	

}
