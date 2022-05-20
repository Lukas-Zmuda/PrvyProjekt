package edu.vynimky;

public class Bublanie {

	public static void main(String[] args) {
		try {
			metoda1();
			
		}catch(VelkeCislo vc) {
			System.out.println("osetrenie");
		}

	}

	private static void metoda1() throws VelkeCislo {
		metoda2();
		
	}

	private static void metoda2() throws VelkeCislo {
		metoda3();
		
	}

	private static void metoda3() throws VelkeCislo{
		throw new VelkeCislo();
		
	}

}
