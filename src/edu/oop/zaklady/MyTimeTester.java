package edu.oop.zaklady;

public class MyTimeTester {

	public static void main(String[] args) {

		MyTime akt = new MyTime(16, 52, 5);
		System.out.println(akt.toString());
		
		//akt.hour = 456;
		//akt.minute = Integer.MAX_VALUE;
		//akt.second = Integer.MIN_VALUE;
		System.out.println(akt.toString());
		
		akt.setTime(17, 10, 12);
		
		akt.setHour(18);
		
		System.out.println(akt.getHour());
		
		akt.setSecond(56);
		System.out.println(akt.toString());
		
		//Osoba o = new Osoba("Ivan", "Hrozny");

	}

}
