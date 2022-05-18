package edu.oop.kompozicia;

public class Tester {

	public static void main(String[] args) {
		
		Autor lp = new Autor("Ludmila", "Podjavorinska", "lp@proza.sk");
		
		Autor[] autors = {
				new Autor("Ludmila", "Podjavorinska", "lp@proza.sk"),
				new Autor("Lubomir", "Feldek", "lf@proza.sk"),
				new Autor("Jan", "Smrek", "js@proza.sk")
		};
		
		Kniha zbierka = new Kniha("Zbierka basni", 40000, autors);
		
		System.out.println(zbierka.pocetAutorov());
		System.out.println(zbierka.autoriKnihy());
		
		
	}

}
