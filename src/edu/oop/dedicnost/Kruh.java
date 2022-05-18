package edu.oop.dedicnost;

public class Kruh extends Utvar implements PohyblivyObjekt, MenitelnyObjekt {
	
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



	@Override
	public double obvod() {
		return 2 * Math.PI * this.polomer;
	}

	@Override
	public double obsah() {
		return Math.PI * this.polomer * this.polomer;
	}

	@Override
	public void posunHore(int y) {
		this.setY(this.getY() + y);		
	}

	@Override
	public void posunDole(int y) {
		this.setY(this.getY() - y);			
	}

	@Override
	public void posunDolava(int x) {
		this.setX(this.getX() - x);
		
	}

	@Override
	public void posunDoprava(int x) {
		this.setX(this.getX() + x);
		
	}

	@Override
	public void zvacsi(int x) {
		this.setPolomer(this.getPolomer() + x);
		
	}

	@Override
	public void zmensi(int x) {
		this.setPolomer(this.getPolomer() - x);
		
	}		
}
