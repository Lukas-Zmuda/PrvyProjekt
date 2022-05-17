package edu.oop.dedicnost;

public class Kruh extends Utvar {
	
	private double polomer;
			
	public Kruh(int x, int y, double polomer, String farba) {
		super(x, y, farba);
		this.polomer = polomer;		
	}
	
	public void info() {
		System.out.println("Kruh so stredom[" + getX() + ", " + getY() + "] r = " + this.getPolomer()
		 + ", farba = " + this.getFarba());
	}	
		
	public double getPolomer() {
		return polomer;
	}
	
	public void setPolomer(double polomer) {
		this.polomer = polomer;
	}

	@Override
	public String toString() {
		return "Kruh so stredom[" + getX() + ", " + getY() + "] r = " + this.getPolomer()
		 + ", farba = " + this.getFarba();
	}
	
	
}
