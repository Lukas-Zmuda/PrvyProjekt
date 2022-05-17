package edu.oop.dedicnost;

public class Stvorec extends Utvar{

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
	
	
	
	

}
