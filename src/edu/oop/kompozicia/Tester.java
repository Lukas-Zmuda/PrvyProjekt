package edu.oop.kompozicia;

public class Tester {

	public static void main(String[] args) {
		
		Autor lp = new Autor("Ludmila", "Podjavorinska", "lp@proza.sk");
		
		Kniha zvz = new Kniha("Z vesny zivota", 10000, lp);
		
		System.out.println(zvz);
		System.out.println(lp);
		
		Kniha perinbaba = new Kniha("Perinbaba", 20000, new Autor("Lubomir", "Feldek", "lf@proza.sk"));
		
		System.out.println(perinbaba.getAutor());

		System.out.println(perinbaba.getAutor().getMeno());
	}

}
