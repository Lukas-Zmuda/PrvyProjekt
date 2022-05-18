package edu.oop.kompozicia;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> vyskaUcastnikov = new ArrayList<>();
		ArrayList<String> menaUcastnikov = new ArrayList<>();
		
		vyskaUcastnikov.add(168);
		vyskaUcastnikov.add(192);
		vyskaUcastnikov.add(186);
		
		System.out.println("Prvy ucastnik je vysoky: " + vyskaUcastnikov.get(0));
		
		System.out.println("Pocet ucastnikov: " + vyskaUcastnikov.size());
		vyskaUcastnikov.add(1, 200);
		
		vyskaUcastnikov.set(0, 169);
		vyskaUcastnikov.remove(vyskaUcastnikov.size() - 1);
		for(int v: vyskaUcastnikov) {
			System.out.println(v + " cm");
		}
		
		vyskaUcastnikov.clear();
		System.out.println(vyskaUcastnikov.size());
		
		ArrayList<Autor> autori = new ArrayList<Autor>();
		
		autori.add(new Autor("Ivan", "Krasko", "ik@sdfsd"));
		System.out.println(autori.size());
		
		System.out.println(autori.get(0).getPriezvisko());		

	}
}