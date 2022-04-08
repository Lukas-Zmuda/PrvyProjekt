
public class DatoveTypy {

	public static void main(String[] args) {
		
		//celociselne typy
		//deklaracia premennej
		short aktualnyRok;
		
		//inicializacia premennej
		aktualnyRok = 2022;
		
		int a = 12;
		int x, y, z;
		int xx = 12, yy = 4, zz = 5;
		
		//byte a = 1;
		aktualnyRok = 2023;
		System.out.println(aktualnyRok);
		System.out.println("aktualnyRok = " + aktualnyRok);
		
		int bin = 0b10000000;
		System.out.println("bin = " + bin);
		int hex = 0xff;
		System.out.println("hex = " + hex);
		int oct = 0123;
		System.out.println("oct = " + oct);
		
		int sss = 1_127_254;
		
		System.out.println("sss = " + sss);
		
		//desatinne cisla
		double dd = 12.54;
		float ff = 1.247f;
		
		//konverzia 
		int akRok = aktualnyRok;
		
		aktualnyRok = (short)akRok;
		
		System.out.println("dd = " + dd);
		
		int dKonvertovane = (int)dd;
		System.out.println(dKonvertovane);
		System.out.println(dd);
		
		//znaky
		char zavinac = '@';
		System.out.println(zavinac);
		
		char velkeA = 65;
		System.out.println(velkeA);
		char uni = '\u0123';
		System.out.println(uni);
		
		//boolean
		boolean slnecno = true;//false
		slnecno = 10 > 3;
		slnecno = false;
		
		System.out.println(slnecno);
		
		
		
	}

}
