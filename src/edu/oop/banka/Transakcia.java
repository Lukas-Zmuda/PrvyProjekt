package edu.oop.banka;

public class Transakcia {
	
	private String operacia;
	private double suma;
	
	public Transakcia(String operacia, double suma) {
		super();
		this.operacia = operacia;
		this.suma = suma;
	}

	public String getOperacia() {
		return operacia;
	}

	public void setOperacia(String operacia) {
		this.operacia = operacia;
	}

	public double getSuma() {
		return suma;
	}

	public void setSuma(double suma) {
		this.suma = suma;
	}

	@Override
	public String toString() {
		return "Transakcia [operacia=" + operacia + ", suma=" + suma + "]";
	}	
	
}