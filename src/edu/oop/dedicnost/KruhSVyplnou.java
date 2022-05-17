package edu.oop.dedicnost;

public class KruhSVyplnou extends Kruh {
	private String farbaVyplne;
	
	public KruhSVyplnou(int x, int y, double polomer, String farba, String farbaVyplne) {
		super(x, y, polomer, farba);
		this.farbaVyplne = farbaVyplne;
	}

	public String getFarbaVyplne() {
		return farbaVyplne;
	}

	public void setFarbaVyplne(String farbaVyplne) {
		this.farbaVyplne = farbaVyplne;
	}
	
	
	
}
