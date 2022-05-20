package edu.vynimky;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Vynimky {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, podiel;
		try {
			System.out.println("Zadaj 1. cislo:");
			a = sc.nextInt();
			if(a > 9999) {
				throw new VelkeCislo();
			}
			System.out.println("Zadaj 2. cislo:");
			b = sc.nextInt();
			
			podiel = a / b;
			
			System.out.println(a + " / " + b + " = " + podiel);
			
		}catch(ArithmeticException ae) {
			System.out.println("Nulou sa nedeli!" + ae.getMessage());
		}catch(InputMismatchException im) {
			System.out.println("Nespravny vstup!");		
		}catch(VelkeCislo vc) {
			System.out.println(vc.getMessage());
		}
		catch(Exception e) {
			System.out.println("Nastala nejaka vynimka!");
		}
		System.out.println("Program pokracuje dalej ...");

	}

}
