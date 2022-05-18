package edu.oop.dedicnost;

public class App{

	public static void main(String[] args) {

		//Utvar utv  = new Utvar(1, 2, "cierny");
		//utv.info();
		
		Kruh k = new Kruh(1, 2, 10, "cerveny");
		//k.info();

		Kruh[] kruhy = new Kruh[5];
		kruhy[0] = k;
		kruhy[1] = new Kruh(2, 4, 5, "zeleny");
		kruhy[2] = new Kruh(0, 0, 100, "cierny");
		kruhy[3] = kruhy[2];
		kruhy[4] = new Kruh(-1, 4, 45, "modry");
		
		
		for(int i = 0; i < kruhy.length; i++) {
			kruhy[i].info();
		}
		
		kruhy[4].setX(10);
		kruhy[4].info();
		
		Obdlznik oo = new Obdlznik(1, 2, 10, 20, "zeleny");
		oo.setFarba("fialovy");
		oo.info();
		
		KruhSVyplnou kkk = new KruhSVyplnou(0, 0, 0, "cervena", "zelena");
		kkk.info();
		
		Utvar u = new Kruh(123, -5, 25, "zlty");
		System.out.println("-------------");
		Utvar[] utvary = new Utvar[3];
		utvary[0] = oo;
		utvary[1] = new Kruh(12, 78, 98, "biely");
		utvary[2] = new Stvorec(0, 0, "zlaty",99);
		
		for(Utvar uuuu: utvary) {
			System.out.println(uuuu);
		}
		
	
		System.out.println(k);
		
		
	}

}
