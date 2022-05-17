package edu.oop.dedicnost;

public class Utvar {
	
	private int x, y;
	private String farba;
		
	public Utvar(int x, int y, String farba) {
		this.x = x;
		this.y = y;
		this.farba = farba;
	}
	
	public void info() {
		System.out.println("Utvar na [" + this.x + ", " + this.y + "]farba = " + this.farba);
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getFarba() {
		return farba;
	}
	public void setFarba(String farba) {
		this.farba = farba;
	}
	
	

}
