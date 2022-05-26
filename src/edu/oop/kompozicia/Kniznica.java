package edu.oop.kompozicia;

import java.util.ArrayList;

public class Kniznica {
	
	private ArrayList<Autor> autori = new ArrayList<Autor>();
	
	public void pridaj(Autor a) {
		autori.add(a);
	}
	
	public void zobraz() {
		for(Autor a: autori) {
			System.out.println(a);
		}
	}
	

}
