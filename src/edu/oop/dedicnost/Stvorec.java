package edu.oop.dedicnost;

public final class Stvorec extends Utvar implements MenitelnyObjekt{

	private int a;
	
	public Stvorec(int x, int y, String farba, int a) {
		super(x, y, farba);
		this.a = a;		
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	@Override
	public void info() {
		System.out.println("Stvorec na [" + this.getX() + ", " + this.getY() + "]a=" +  
							this.getA() + "farba=" + this.getFarba());
	}

	@Override
	public String toString() {
		
		return "Stvorec na [" + this.getX() + ", " + this.getY() + "]a=" +  
				this.getA() + "farba=" + this.getFarba();
	}

	@Override
	public double obvod() {
		return 4 * a;
	}

	@Override
	public double obsah() {
		return a * a;
	}

	@Override
	public void zvacsi(int x) {
		this.setA(this.getA() + x);
		
	}

	@Override
	public void zmensi(int x) {
		this.setA(this.getA() - x);
		
	}
	
	
	
	

}
